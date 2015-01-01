package com.stono.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAwareAction implements ApplicationAware,SessionAware,RequestAware,ParameterAware {
	public String execute() {
		// 1. ��application�м���һ�����ԣ�applicationKey2-applicationValue2
		application.put("applicationKey2", "applicationValue2");
		// 2. ��application�ж�ȡһ������date������ӡ��
		System.out.println(application.get("date"));
		// ��session�м���һ������
		session.put("sKey2", "sValue2");
		// ��request�м���һ������
		request.put("rKey2", "rValue2");
		//��paremeter�л�ȡһ��ֵ
		System.out.println(parameters.get("name")[0]);
		return "success";
	}

	private Map<String, Object> application;

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	private Map<String, String[]> parameters;
	@Override
	public void setParameters(Map<String, String[]> parameters) {
		this.parameters = parameters;
	}

	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	private Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
