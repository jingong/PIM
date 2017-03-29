package cn.edu.ldu.action.schedule;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import cn.edu.ldu.dao.ScheduleInfo;
import cn.edu.ldu.model.Schedule;

import com.opensymphony.xwork2.ActionSupport;

public class GetUpdateSchAction extends ActionSupport implements ServletRequestAware,SessionAware{
	private HttpServletRequest request;
	private Map<String, Object> session;
	private String mess = "error";
	private Schedule schedule;
	
	
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public String execute() throws Exception {
		int id = Integer.parseInt((String)request.getParameter("id"));
		ScheduleInfo info = new ScheduleInfo();
		schedule = info.selectSchById(id).get(0);
		session.put("schedule", schedule);
		mess = SUCCESS;
		return mess;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
