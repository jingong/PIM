package cn.edu.ldu.action.login;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.LoginRegisterInfo;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private User user;
	private String message = "error";
	private List list;
	private Map<String, Object> session;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// @Override
	// public void validate() {
	// if(this.user.getUserName()==null||this.user.getUserName().length()==0){
	// message = INPUT;
	// addFieldError("user.userName", "用户名不能为空!");
	// }else{
	// LoginRegisterInfo info= new LoginRegisterInfo();
	// list=info.queryInfo("userName", this.user.getUserName());
	// if(list.size()==0){
	// addFieldError("user.userName", "该用户尚未注册");
	// }else{
	// User u = new User();
	// for(int i=0;i<list.size();i++){
	// u=(User) list.get(i);
	// if(this.user.getUserName().equals(u.getUserName())){
	// //把登录的个人信息保存到session对象中
	// session.put("user", u);
	// if(u.getPassword().equals(this.user.getPassword())){
	// message=SUCCESS;
	// }else{
	// addFieldError("user.password", "登录密码不正确");
	// }
	// }
	// }
	// }
	// }
	// }

	@Override
	public String execute() throws Exception {
		LoginRegisterInfo info= new LoginRegisterInfo();
		list=info.queryInfo("userName", this.user.getUserName());
		User u = new User();
		for (int i = 0; i < list.size(); i++) {
			u = (User) list.get(i);
			if (this.user.getUserName().equals(u.getUserName())) {
				// 把登录的个人信息保存到session对象中
				session.put("user", u);
				if (u.getPassword().equals(this.user.getPassword())) {
					message = SUCCESS;
				} else {
					message = INPUT;
				}
			}
		}
		return message;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
