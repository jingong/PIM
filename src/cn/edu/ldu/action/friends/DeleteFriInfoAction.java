package cn.edu.ldu.action.friends;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FriendsInfo;
import cn.edu.ldu.model.Friends;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteFriInfoAction extends ActionSupport implements ServletRequestAware{
	private Friends friends;
	private String mess = "error";
	private HttpServletRequest request;
	

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
		//int id = friends.getId();
		//int fid = Integer.parseInt(id);
		FriendsInfo info = new FriendsInfo();
		mess = info.deleteFriend(id);
		return mess;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {	
		this.request = request;
	}
}
