package com.itheima.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.itheima.domain.Account;

/**
 * 账户的持久层
 * @author Administrator
 *
 */
@Repository("accountDao")
public interface IAccountDao {
	
	/**
	 * 查询所有
	 */
	@Select("select * from account")
	List<Account> findAll();
	
	/**
	 * 保存
	 */
	@Insert("insert into account(name,money) values(#{name},#{money})")
	void save(Account account);
	
	/***
	 * 根据id查询
	 */
	@Select("select * from account where id = #{id}")
	Account findById(Integer accountId);
	
	/**
	 * 更新
	 */
	@Update("update  account set money=#{money},name=#{name} where id= #{id}")
	void updateAccount(Account account);
	
}
