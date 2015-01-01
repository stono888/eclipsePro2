package com.stono.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class TestServletActionContextAction {

	public String execute(){
		/**
		 * ServletActionContext�����Դ��л�ȡ����ǰAction ������Ҫ��һ��Servlet API��صĶ���
		 * ���õķ���:
		 * 1.��ȡHttpServletRequest��ServletActionContext.getRequest()
		 * 2.��ȡHttpSession��ServletActionContext.getRequest().getSession();
		 * 3.��ȡServletContext��ServletActionContext.getServletContext()
		 */
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext servletContext = ServletActionContext.getServletContext();
		System.out.println("execute...");
		return "success";
	}
}
