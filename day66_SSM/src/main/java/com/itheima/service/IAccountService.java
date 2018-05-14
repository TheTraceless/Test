package com.itheima.service;

import java.util.List;

import com.itheima.domain.Account;

/**
 * 账户的业务层接口
 * @author Administrator
 *
 */
public interface IAccountService {
	/***
	 * 查询所有账户
	 */
	List<Account> findAllAccount();
	
	/**
	 * 保存账户
	 */
	void saveAccount(Account account);
	
	/***
	 * 根据id查询账户
	 */
	Account findAccountById(Integer accountId);
	
	/**
	 * 修改账户信息
	 */
	void updateAccount(Account account); 
	
}
