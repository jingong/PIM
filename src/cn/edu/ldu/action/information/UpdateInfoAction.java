package cn.edu.ldu.action.information;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.LoginRegisterInfo;
import cn.edu.ldu.dao.PersonInfo;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateInfoAction extends ActionSupport implements SessionAware{
	private User user;
	private Map<String, Object> session;
	private String mess = ERROR;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public void validate() {
        if(this.user.getPassword()==null||this.user.getPassword().length()==0){
        	mess = INPUT;
            addFieldError("user.password", "登录密码不许为空！");
        }else if(this.user.getPassword1()==null||this.user.getPassword1().length()==0){
        	mess = INPUT;
        	addFieldError("user.password1", "重复密码不许为空！");
        }else if(!this.user.getPassword().equals(this.user.getPassword1())){
        	addFieldError("user.password1", "两次密码不一致！");
        }
	}
	
	@Override
	public String execute() throws Exception {
		PersonInfo info = new PersonInfo();
		mess = info.updateInfo(user);
		//数据更新完以后在session中更新用户的信息
		session.put("user", user);
		return mess;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
