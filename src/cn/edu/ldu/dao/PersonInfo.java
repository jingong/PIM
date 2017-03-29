package cn.edu.ldu.dao;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.ldu.factory.HibernateSessionFactory;
import cn.edu.ldu.model.User;

public class PersonInfo {
	private Session session;
	private Transaction transaction;
	private Query query;
	public PersonInfo() {
	}
	
	public String updateInfo(User user) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "update User as u set u.userName=?,u.password=?,u.birth=?,u.location=?,u.email=? where u.id=?";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setString(0, user.getUserName());
			query.setString(1, user.getPassword());
			query.setDate(2, user.getBirth());
			query.setString(3, user.getLocation());
			query.setString(4, user.getEmail());
			query.setInteger(5, user.getId());
			query.executeUpdate();
			transaction.commit();
			mess = "success";
			return mess;
		} catch (Exception e) {
			message("RegisterInfo.error:" + e);
			e.printStackTrace();
			return "input";
		}
	}
	
	public void message(String mess) {
		int type = JOptionPane.YES_NO_OPTION;
		String title = "提示信息";
		JOptionPane.showMessageDialog(null, mess, title, type);
	}
}
