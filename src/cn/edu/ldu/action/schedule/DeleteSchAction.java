package cn.edu.ldu.action.schedule;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import cn.edu.ldu.dao.ScheduleInfo;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteSchAction extends ActionSupport implements ServletRequestAware{
	private HttpServletRequest request;
	private String mess = "error";
	@Override
	public String execute() throws Exception {
		int id = Integer.parseInt((String)request.getParameter("id"));
		ScheduleInfo info = new ScheduleInfo();
		mess = info.deleteSch(id);
		return mess;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
