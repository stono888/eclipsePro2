package com.stono.test;

import org.junit.Test;

import com.stono.interfaces.OneInterface;

public class TestOneInterface extends UnitTestBase {

	public TestOneInterface(){
		super("classpath*:spring-ioc.xml");
	}
	@Test
	public void testHello() {
		OneInterface oneInterface = super.getBean("oneInterface");
		System.out.println(oneInterface.hello("我的输入参数"));
	}

}
