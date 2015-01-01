package com.stono.struts2.action;

import java.util.Map;



import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContextAction {

	public String execute() {
		// 0. ��ȡActionContext����
		// ActionContext��Action�������Ķ��󣬿��Դ��л�ȡ��Action��Ҫ��һ����Ϣ
		ActionContext actionContext = ActionContext.getContext();

		// 1. ��ȡapplication��Ӧ��Map�������������һ����Ϥ��
		// ͨ������ActionContext�����getApplication()��������ȡapplication�����Map����
		Map<String, Object> applicationMap = actionContext.getApplication();
		// ��������
		applicationMap.put("applicationKey", "applicationValue");
		// ��ȡ����
		Object date = applicationMap.get("date");
		System.out.println("date:" + date);
		// 2. ��ȡsession��Ӧ��Map�������������һ����Ϥ��
		Map<String, Object> sessionMap = actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		System.out.println(sessionMap.getClass());
		if (sessionMap instanceof SessionMap) {
			SessionMap sm = (SessionMap) sessionMap;
			sm.invalidate();
			System.out.println("session ʧЧ�ˡ�");
		}
		// 3. request
		// ActionContex�в�û���ṩgetRequest��������ȡrequest��Ӧ��Map
		// ��Ҫ�ֹ�����get()����������request�ַ�������ȡ��
		Map<String, Object> requestMap = (Map<String, Object>) actionContext
				.get("request");
		requestMap.put("requestKey", "requestValue");
		// 4. ��ȡ���������Ӧ��Map������ȡָ���Ĳ���ֵ
		// ����������������֣�ֵ�����������ֵ��Ӧ���ַ�������
		// ע�⣺1.getParameters�ķ���ֵΪMap<String,Object>,������Map<String,String[]>
		// 2.parameters���Mapֻ�ܶ�������д�����ݣ����д�룬����������Ҳ�������ã�
		Map<String, Object> parameters = actionContext.getParameters();
		System.out.println(((String[]) parameters.get("name"))[0]);
		System.out.println(parameters.get("name"));
		parameters.put("age", 100);
		return "success";
	}

}
