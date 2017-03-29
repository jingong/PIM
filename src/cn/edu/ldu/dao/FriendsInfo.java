package cn.edu.ldu.dao;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.ldu.factory.HibernateSessionFactory;
import cn.edu.ldu.model.Friends;
import cn.edu.ldu.model.User;

public class FriendsInfo {
	private Session session;
	private Query query;
	private Transaction transaction;
	private List<Friends> fri_list;

	public FriendsInfo() {
	}

	// 查询所有好友
	public List<Friends> selectAllFriends(String userName) {
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "from Friends as f where f.userName=:userName";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setString("userName", userName);
			fri_list = query.list();
			transaction.commit();
			return fri_list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 插入好友
	public String insertFriend(Friends friends) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			transaction = session.beginTransaction();
			session.save(friends);
			transaction.commit();
			mess = "success";
			return mess;
		} catch (Exception e) {
			message("insertFriend.error:" + e);
			e.printStackTrace();
			return "input";
		}
	}

	// 模糊查询好友
	public List<Friends> selectFriends(String friendName) {
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "from Friends as f where f.friendName like :friendName";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setString("friendName", "%" + friendName + "%");
			fri_list = query.list();
			transaction.commit();
			return fri_list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 根据id查询好友
	public List<Friends> selectFriendsById(int id) {
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "from Friends as f where f.id=:id";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setInteger("id",id);
			fri_list = query.list();
			transaction.commit();
			return fri_list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 删除好友
	public String deleteFriend(int id) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "delete Friends as f where f.id=?";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setInteger(0, id);
			int count = query.executeUpdate();
			transaction.commit();
			if (count > 0) {
				mess = "success";
			}
			mess = "input";
			return mess;
		} catch (Exception e) {
			message("insertFriend.error:" + e);
			e.printStackTrace();
			return "input";
		}
	}

	// 更新好友信息
	public String updateFriInfo(Friends friends) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "update Friends as f set f.friendName=?,f.friendPhone=?,f.friendEmail=?,f.friendPlace=? where f.id=?";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setString(0, friends.getFriendName());
			query.setString(1, friends.getFriendPhone());
			query.setString(2, friends.getFriendEmail());
			query.setString(3, friends.getFriendPlace());
			query.setInteger(4, friends.getId());
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

	// 信息提示
	public void message(String mess) {
		int type = JOptionPane.YES_NO_OPTION;
		String title = "提示信息";
		JOptionPane.showMessageDialog(null, mess, title, type);
	}
}
