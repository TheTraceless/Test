package com.itheima.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

/**
 * 账户的控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("account")
public class AccountController {
	
	@Autowired
	private IAccountService accountService;
	/***
	 * 查询所有账户
	 */
	@RequestMapping("findAll")
	public ModelAndView  findAllAccount(HttpServletRequest request) {
		//查询所有账户
		List<Account> accounts = accountService.findAllAccount();
		//创建返回值对象
		ModelAndView mv = new ModelAndView();
		//设置返回的结果视图
		mv.setViewName("accountlist");
		//设置响应带有的数据
		mv.addObject("accounts",accounts);
		return mv;
	}
	
	/***
	 * 保存账户
	 */
	@RequestMapping(value="saveAccount",method=RequestMethod.PUT)
	public String saveAccount(Account account) {
		accountService.saveAccount(account);
		return "redirect:/account/findAll";
	}
	/**
	 * 根据id查询账户信息
	 */
	@RequestMapping(value="findById/{iid}",method=RequestMethod.GET)
	public ModelAndView findById(@PathVariable("iid")Integer id) {
		//根据id查询账户信息
		Account account = accountService.findAccountById(id);
		//创建返回值对象
		ModelAndView mv = new ModelAndView();
		//给mv中填充参数
		mv.addObject("account", account);
		mv.setViewName("editaccount");
		//返回
		return mv;
	}
	/***
	 * 修改账户信息
	 */
	@RequestMapping("updateAccount")
	public String updateByAccount(Account account) {
		//根据id查询账户信息
		accountService.updateAccount(account);
		//返回
		return "redirect:/account/findAll";
	}
}
