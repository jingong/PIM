package cn.edu.ldu.action.schedule;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.ScheduleInfo;
import cn.edu.ldu.model.Schedule;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class LookSchAction extends ActionSupport implements SessionAware{
	private Schedule schedule;
	private List<Schedule> sch_lists;
	private Map<String, Object> session;
	public Schedule getSchedule() {
		return schedule;
	}


	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}


	public List<Schedule> getSch_lists() {
		return sch_lists;
	}


	public void setSch_lists(List<Schedule> sch_lists) {
		this.sch_lists = sch_lists;
	}


	@Override
	public String execute() throws Exception {
		User user = (User)session.get("user");
		ScheduleInfo info = new ScheduleInfo();
		sch_lists = info.getAllSch(user.getUserName());
		return SUCCESS;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
