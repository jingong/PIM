package cn.edu.ldu.action.friends;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FriendsInfo;
import cn.edu.ldu.model.Friends;

import com.opensymphony.xwork2.ActionSupport;

public class FindFriInfoAction extends ActionSupport implements SessionAware{
	private Friends friends;
	private String mess = "error";
	private List<Friends> list;
	private Map<String, Object> session;
	public Friends getFriends() {
		return friends;
	}

	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	
	public List<Friends> getList() {
		return list;
	}

	public void setList(List<Friends> list) {
		this.list = list;
	}

	@Override
	public void validate() {
		if(this.friends.getFriendName()==null || this.friends.getFriendName().length()==0){
			mess = INPUT;
            addFieldError("friends.friendName", "好友名不能为空!");
        }
	}
	
	@Override
	public String execute() throws Exception {
		FriendsInfo info = new FriendsInfo();
		list = info.selectFriends(friends.getFriendName());
		//把查询到的当前好友放到session中
		session.put("friend", list.get(0));
		mess = SUCCESS;
		return mess;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
