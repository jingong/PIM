package cn.edu.ldu.action.schedule;

import cn.edu.ldu.dao.ScheduleInfo;
import cn.edu.ldu.model.Schedule;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateSchAction extends ActionSupport{
	private Schedule schedule;
	private String mess = "error";
	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public String execute() throws Exception {
		ScheduleInfo info = new ScheduleInfo();
		mess = info.updateSch(schedule);
		return mess;
	}
}
