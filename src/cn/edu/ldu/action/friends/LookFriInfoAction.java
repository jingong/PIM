package cn.edu.ldu.action.friends;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FriendsInfo;
import cn.edu.ldu.model.Friends;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class LookFriInfoAction extends ActionSupport implements SessionAware{
	private Friends friends;
	private List<Friends> fri_lists;
	private Map<String, Object> session;
	public Friends getFriends() {
		return friends;
	}
	
	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	
	public List<Friends> getFri_lists() {
		return fri_lists;
	}

	public void setFri_lists(List<Friends> fri_lists) {
		this.fri_lists = fri_lists;
	}

	@Override
	public void validate() {
		super.validate();
	}
	
	@Override
	public String execute() throws Exception {
		FriendsInfo info = new FriendsInfo();
		User user = (User)session.get("user");
		fri_lists = info.selectAllFriends(user.getUserName());
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
