package com.stono.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class TestServletActionContextAction {

	public String execute(){
		/**
		 * ServletActionContext：可以从中获取到当前Action 对象需要的一切Servlet API相关的对象
		 * 常用的方法:
		 * 1.获取HttpServletRequest：ServletActionContext.getRequest()
		 * 2.获取HttpSession：ServletActionContext.getRequest().getSession();
		 * 3.获取ServletContext：ServletActionContext.getServletContext()
		 */
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext servletContext = ServletActionContext.getServletContext();
		System.out.println("execute...");
		return "success";
	}
}
