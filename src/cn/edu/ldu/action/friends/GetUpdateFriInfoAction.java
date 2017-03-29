package cn.edu.ldu.action.friends;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FriendsInfo;
import cn.edu.ldu.model.Friends;

import com.opensymphony.xwork2.ActionSupport;

public class GetUpdateFriInfoAction extends ActionSupport implements ServletRequestAware,SessionAware{
	private Friends friends;
	private HttpServletRequest request;
	private Map<String, Object> session;
	public Friends getFriends() {
		return friends;
	}

	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	@Override
	public void validate() {
		super.validate();
	}
	@Override
	public String execute() throws Exception {
		int id = Integer.parseInt((String)request.getParameter("id"));
		FriendsInfo info = new FriendsInfo();
		//取出来查询到的好友
		session.put("friend",info.selectFriendsById(id).get(0));
		return SUCCESS;
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
