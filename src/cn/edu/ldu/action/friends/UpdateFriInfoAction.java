package cn.edu.ldu.action.friends;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FriendsInfo;
import cn.edu.ldu.model.Friends;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateFriInfoAction extends ActionSupport implements SessionAware{
	private Friends friends;
	private String mess = "error";
	private Map<String, Object> session;
	public Friends getFriends() {
		return friends;
	}
	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	@Override
	public void validate() {
		if(this.friends.getFriendName()==null||this.friends.getFriendName().length()==0){
			mess = INPUT;
            addFieldError("friends.friendName", "用户名不能为空!");
        }
	}
	@Override
	public String execute() throws Exception {
		FriendsInfo info = new FriendsInfo();
		mess = info.updateFriInfo(friends);
		if (mess.equals("success")) {
			session.put("friend", friends);
		}
		return mess;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
