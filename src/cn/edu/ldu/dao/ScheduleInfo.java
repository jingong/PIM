package cn.edu.ldu.dao;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.ldu.factory.HibernateSessionFactory;
import cn.edu.ldu.model.Friends;
import cn.edu.ldu.model.Schedule;

public class ScheduleInfo {
	private Session session;
	private Query query;
	private Transaction transaction;
	private List<Schedule> sch_list;
	public ScheduleInfo() {
	}
	//查询当前用户的所有日程安排
	public List<Schedule> getAllSch(String userName){
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "from Schedule as s where s.userName=:userName";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setString("userName", userName);
			sch_list = query.list();
			transaction.commit();
			return sch_list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	//插入日程安排
	public String insertSch(Schedule schedule){
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			transaction = session.beginTransaction();
			session.save(schedule);
			transaction.commit();
			mess = "success";
			return mess;
		} catch (Exception e) {
			message("insertFriend.error:" + e);
			e.printStackTrace();
			return "input";
		}
	}
	//删除日程
	public String deleteSch(int id) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "delete Schedule as s where s.id=?";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setInteger(0, id);
			int count = query.executeUpdate();
			transaction.commit();
			if (count > 0) {
				mess = "success";
			}else {
				mess = "input";
			}
			return mess;
		} catch (Exception e) {
			message("insertFriend.error:" + e);
			e.printStackTrace();
			return "error";
		}
	}
	// 根据id查询日程
	public List<Schedule> selectSchById(int id) {
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "from Schedule as s where s.id=:id";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setInteger("id",id);
			sch_list = query.list();
			transaction.commit();
			return sch_list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	// 更新日程安排
	public String updateSch(Schedule schedule) {
		String mess = "error";
		session = HibernateSessionFactory.getSession();
		try {
			String hql = "update Schedule as s set s.date=?,s.thing=? where s.id=?";
			transaction = session.beginTransaction();
			query = session.createQuery(hql);
			query.setDate(0, schedule.getDate());
			query.setString(1, schedule.getThing());
			query.setInteger(2, schedule.getId());
			query.executeUpdate();
			transaction.commit();
			mess = "success";
			return mess;
		} catch (Exception e) {
			message("updateSch.error:" + e);
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
