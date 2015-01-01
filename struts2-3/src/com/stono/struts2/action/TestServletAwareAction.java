package com.stono.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
/**
 * 通过实现ServletXxxAware接口的方式可以由Struts2注入需要的Servlet相关的对象
 * 
 * ServletRequestAware：注入HpptServletRequest对象
 * ServletContextAware：注入ServletContext对象
 * ServletResponseAware:注入HttpServletResponse对象
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
