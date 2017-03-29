package cn.edu.ldu.action.schedule;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.ScheduleInfo;
import cn.edu.ldu.model.Schedule;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class AddSchAction extends ActionSupport implements SessionAware{
	private Schedule schedule;
	private String mess = "error";
	private Map<String, Object> session;
	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String execute() throws Exception {
		User user = (User)session.get("user");
		schedule.setUserName(user.getUserName());
		ScheduleInfo info = new ScheduleInfo();
		mess = info.insertSch(schedule);
		return mess;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
