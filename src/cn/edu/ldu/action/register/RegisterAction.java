package cn.edu.ldu.action.register;

import java.util.List;

import cn.edu.ldu.dao.LoginRegisterInfo;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private User user;
	private String mess = "error";
	private List list;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
//	@Override
//	public void validate() {
//		if(this.user.getUserName()==null||this.user.getUserName().length()==0){
//			mess = INPUT;
//            addFieldError("user.userName", "用户名不能为空！");
//        }else{
//            LoginRegisterInfo info= new LoginRegisterInfo();
//            list=info.queryInfo("userName", this.user.getUserName());
//            User u=new User();
//            for(int i=0;i<list.size();i++){
//                u=(User) list.get(i);
//                if(u.getUserName().equals(this.user.getUserName())){
//                	mess = INPUT;
//                	addFieldError("user.userName", "用户名已存在！");
//                }
//            }
//        }
//        if(this.user.getPassword()==null||this.user.getPassword().length()==0){
//        	mess = INPUT;
//            addFieldError("user.password", "登录密码不许为空！");
//        }else if(this.user.getPassword1()==null||this.user.getPassword1().length()==0){
//        	mess = INPUT;
//        	addFieldError("user.password1", "重复密码不许为空！");
//        }else if(!this.user.getPassword().equals(this.user.getPassword1())){
//        	mess = SUCCESS;
//        	addFieldError("user.password1", "两次密码不一致！");
//        }
//	}
	@Override
	public String execute() throws Exception {
		LoginRegisterInfo info = new LoginRegisterInfo();
		mess = info.saveInfo(user);
		return mess;
	}
}
