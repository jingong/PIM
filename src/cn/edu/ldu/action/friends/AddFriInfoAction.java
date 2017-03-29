package cn.edu.ldu.action.friends;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FriendsInfo;
import cn.edu.ldu.model.Friends;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class AddFriInfoAction extends ActionSupport implements SessionAware{
	private Friends friends;
	private Map<String, Object> session;
	private String mess = "error";
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
		//获取到当前用户的用户名
		User user = (User)session.get("user");
		friends.setUserName(user.getUserName());
		FriendsInfo info = new FriendsInfo();
		mess = info.insertFriend(friends);
		return mess;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
