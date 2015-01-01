package com.stono.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
/**
 * ͨ��ʵ��ServletXxxAware�ӿڵķ�ʽ������Struts2ע����Ҫ��Servlet��صĶ���
 * 
 * ServletRequestAware��ע��HpptServletRequest����
 * ServletContextAware��ע��ServletContext����
 * ServletResponseAware:ע��HttpServletResponse����
 * @author Administrator
 *
 */
public class TestServletAwareAction implements 
ServletRequestAware,ServletContextAware,ServletResponseAware{

	@Override
	public void setServletContext(ServletContext context) {
		System.out.println(context);
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		System.out.println(request);
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		System.out.println(response);
	}
	
	public String execute(){
		
		return "success";
	}


}
