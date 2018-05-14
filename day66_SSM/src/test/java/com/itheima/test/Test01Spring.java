package com.itheima.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.service.IAccountService;

/**
 * 测试spring框架的IOC独立运行
 * @author Administrator
 *
 */
public class Test01Spring {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IAccountService as = ac.getBean("accountService",IAccountService.class);
		as.findAllAccount();
	}

}
