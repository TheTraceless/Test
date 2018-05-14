package com.itheima.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;

/**
 * 测试mybatis独立运行
 * @author Administrator
 *
 */
public abstract class Test02MyBatis {
	public static void main(String[] args) throws IOException {
		//读取配置文件，生成 一个流对象
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//使用构建者对象SqlSessionFactoryBuilder创建一个SqlSesion工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//使用工厂的opensession方法得到一个sqlsession对象
		SqlSession session = factory.openSession();
		//通过getMapper方法得到dao的代理对象
		IAccountDao accountDao = session.getMapper(IAccountDao.class);
		//执行dao中的 方法
		/*List<Account> accounts = accountDao.findAll();
		for (Account account : accounts) {
			System.out.println(account);
		}*/
		/*Account account = accountDao.findById(11);
		System.out.println(account);*/
		Account account = new Account();
		account.setMoney(1212f);
		account.setName("opop");
		accountDao.save(account);
		session.commit();
		//释放资源
		session.close();
		in.close();
	}
}
