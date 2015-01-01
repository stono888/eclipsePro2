package com.stono.struts2.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class UserAction implements SessionAware, ApplicationAware {
	private String username;
	
	public String logout(){
		//1. ��������-1����ȡ����������������>0����-1
		Integer count = (Integer)application.get("count");
		if(count !=null && count >0){
			count --;
			application.put("count", count);
		}
		
		//2. sessionʧЧ��ǿתΪSessionMap������invalidate����
		((SessionMap)session).invalidate();
		
		return "logout-success";
	}

	public String execute() {
		// ���û���Ϣ����session��
		// 1. ��ȡsession��ͨ��ʵ��SessionAware�ӿ�
		// 2. ��ȡ��¼��Ϣ��ͨ����A����Ŷ�����setter����
		// 3. ���û���Ϣ����Session��
		session.put("username", username);
		// ��������+1
		// 1. ��ȡ��ǰ��������������application�л�ȡ
		Integer count = (Integer) application.get("count");
		if (count == null) {
			count = 0;
		}
		// 2. ����������1
		count++;
		application.put("count", count);
		return "login-success";
	}

	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private Map<String, Object> application;

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
