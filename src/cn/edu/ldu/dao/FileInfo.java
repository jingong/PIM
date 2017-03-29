package cn.edu.ldu.dao;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.ldu.factory.HibernateSessionFactory;
import cn.edu.ldu.model.File;
import cn.edu.ldu.model.Friends;

public class FileInfo {
	private Session session;
	private Query query;
	private Transaction transaction;
	private List<File> file_list;
	public FileInfo() {
	}
	// 查询所有好友
	public List<File> selectAllFiles(String userName) {
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "from File as f where f.userName=:userName";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setString("userName", userName);
			file_list = query.list();
			transaction.commit();
			return file_list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 插入好友
	public String insertFile(File file) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			transaction = session.beginTransaction();
			session.save(file);
			transaction.commit();
			mess = "success";
			return mess;
		} catch (Exception e) {
			message("insertFriend.error:" + e);
			e.printStackTrace();
			return "input";
		}
	}
	// 删除文件 根据id删除文件
	public String deleteFriend(int id) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "delete File as f where f.id=?";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setInteger(0, id);
			int count = query.executeUpdate();
			transaction.commit();
			if (count > 0) {
				mess = "success";
			}
			return mess;
		} catch (Exception e) {
			message("deleteFile.error:" + e);
			e.printStackTrace();
			return "error";
		}
	}
	// 信息提示
	public void message(String mess) {
		int type = JOptionPane.YES_NO_OPTION;
		String title = "提示信息";
		JOptionPane.showMessageDialog(null, mess, title, type);
	}
}
