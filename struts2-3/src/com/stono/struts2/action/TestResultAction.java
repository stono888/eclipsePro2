package com.stono.struts2.action;

public class TestResultAction {

	private int number;

	public String execute() {
		String result = null;
		// �����������number��ֵ�����ض�Ӧ��JSPҳ��
		// 1. number mod 3==0, ����success.jsp
		int i = number % 4;
		if (i == 0) {
			result = "success";
		} else if (i == 1) {
			result = "login";
		} else if (i == 2) {
			result = "index";
		}else if(i==3){
			result = "test";
		}
		// 2. number mod 3 ==1 ,���� login.jsp

		// 3. number mod 3 ==2 ,����index.jsp
		return result;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
