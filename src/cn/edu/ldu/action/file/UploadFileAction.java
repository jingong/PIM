package cn.edu.ldu.action.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import cn.edu.ldu.dao.FileInfo;
import cn.edu.ldu.model.File;
import cn.edu.ldu.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport implements SessionAware{
	private File file;
	private java.io.File upload;
	private String uploadContentType; //文件类型
	private String uploadFileName; //文件名称  
	private Map<String, Object> session;
	
	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public java.io.File getUpload() {
		return upload;
	}

	public void setUpload(java.io.File upload) {
		this.upload = upload;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	@Override
	public String execute() throws Exception {
		String filePath = ServletActionContext.getServletContext().getRealPath("/upload");
		User user = (User)session.get("user");
		file.setUserName(user.getUserName());
		file.setFileName(uploadFileName);
		file.setFilePath(filePath);
		file.setFileType(uploadContentType);
		InputStream is = new FileInputStream(upload);    
        OutputStream os = new FileOutputStream(new java.io.File(filePath, getUploadFileName()));
        System.out.println("file: " + getUploadFileName());
        System.out.println("filePath: " + filePath);
        byte[] buffer = new byte[1024];
        int length = 0;     
        while((length = is.read(buffer)) > 0)
        {
            os.write(buffer,0,length);
        }
        os.close();
        is.close();
        FileInfo info = new FileInfo();
        info.insertFile(file);
        return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
