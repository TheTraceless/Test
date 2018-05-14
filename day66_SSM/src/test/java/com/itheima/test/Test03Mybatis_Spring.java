package com.itheima.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

/**
 * 测试spring和mybatis的整合
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test03Mybatis_Spring {
	@Autowired
	private IAccountService as;
	@Test
	public void testFindAll() {
		List<Account> account = as.findAllAccount();
		for (Account account2 : account) {
			System.out.println(account2);
		}
	}
	@Test
	public void testSave() {
		Account account = new Account();
		account.setName("SSM整合");
		account.setMoney(1231f);
		as.saveAccount(account);
	}
	
	@Test
	public void testFindById() {
		Account account = as.findAccountById(1);
		System.out.println(account);
	}
	

}
