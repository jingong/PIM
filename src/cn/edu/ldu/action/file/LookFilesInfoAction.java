package cn.edu.ldu.action.file;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FileInfo;
import cn.edu.ldu.model.File;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class LookFilesInfoAction extends ActionSupport implements SessionAware{
	private List<File> file_lists;
	private Map<String, Object> session;
	public List<File> getFile_lists() {
		return file_lists;
	}

	public void setFile_lists(List<File> file_lists) {
		this.file_lists = file_lists;
	}
	
	@Override
	public String execute() throws Exception {
		User user = (User)session.get("user");
		FileInfo info = new FileInfo();
		file_lists = info.selectAllFiles(user.getUserName());
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
