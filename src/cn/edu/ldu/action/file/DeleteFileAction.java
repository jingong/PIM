package cn.edu.ldu.action.file;

import java.io.File;

import cn.edu.ldu.dao.FileInfo;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteFileAction extends ActionSupport{
	private int id;
	private String mess = "error";
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String execute() throws Exception {
		FileInfo info = new FileInfo();
		mess = info.deleteFriend(getId());
		if (mess.equals(SUCCESS)) {
			
		}
		return mess;
	}
}
