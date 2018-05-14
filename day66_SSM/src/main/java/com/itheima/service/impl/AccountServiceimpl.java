package com.itheima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;


/**
 * 账户的业务实现类
 * @author Administrator
 *
 */
@Service("accountService")
public class AccountServiceimpl implements IAccountService {
	@Autowired
	private IAccountDao accountDao;
	
	@Override
	public List<Account> findAllAccount() {
		
		return accountDao.findAll();
	}

	@Override
	public void saveAccount(Account account) {
		accountDao.save(account);

	}

	@Override
	public Account findAccountById(Integer accountId) {
		return accountDao.findById(accountId);
	}
	
	@Override
	public void updateAccount(Account account) {
		accountDao.updateAccount(account);
	}
}
