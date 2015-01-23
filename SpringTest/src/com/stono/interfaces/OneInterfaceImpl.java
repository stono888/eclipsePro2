package com.stono.interfaces;

public class OneInterfaceImpl implements OneInterface {

	@Override
	public String hello(String word) {
		return "word from interface OneInterface" + word;
	}

}
