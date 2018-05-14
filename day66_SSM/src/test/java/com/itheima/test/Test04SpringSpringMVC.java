package com.itheima.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.service.IAccountService;
/**
 * 
 * <p>Title: Test04SpringSpringMVC</p>
 * <p>Description: 测试spring加载容器的问题</p>
 * <p>Company: http://www.itheima.com/ </p> 
 * @author zhy
 * @date   2018年4月21日
 */
public class Test04SpringSpringMVC {

	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
//		as.findAllAccount();
//		Object obj = ac.getBean("accountController");
//		System.out.println(obj);
		
		
		
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("springmvc.xml");
		IAccountService as = ac.getBean("accountService",IAccountService.class);
	
		System.out.println(as);
		Object obj = ac.getBean("accountController");
		System.out.println(obj);
	
		
	}

}
