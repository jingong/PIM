package cn.edu.ldu.dao;

/*
 * 登录和注册业务功能，封装到这个JavaBean
 */
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.ldu.factory.HibernateSessionFactory;
import cn.edu.ldu.model.User;

public class LoginRegisterInfo {

	private Session session;
	private Transaction transaction;
	private Query query;

	public LoginRegisterInfo() {
	}

	public String saveInfo(User user) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
			mess = "success";
			return mess;
		} catch (Exception e) {
			message("RegisterInfo.error:" + e);
			e.printStackTrace();
			return "input";
		}
	}

	public List queryInfo(String type, Object value) {
		session = HibernateSessionFactory.getSession();
		try {
			String hqlsql = "from User as u where u.userName=?";
			query = session.createQuery(hqlsql);
			query.setParameter(0, value);
			List list = query.list();
			transaction = session.beginTransaction();
			transaction.commit();
			return list;
		} catch (Exception e) {
			message("LoginRegisterInfo类中有异常，异常为：:" + e);
			e.printStackTrace();
			return null;
		}
	}

	public void message(String mess) {
		int type = JOptionPane.YES_NO_OPTION;
		String title = "提示信息";
		JOptionPane.showMessageDialog(null, mess, title, type);
	}

}
