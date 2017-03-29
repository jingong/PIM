package cn.edu.ldu.action.file;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownFileAction extends ActionSupport {
	private String fileName;

	public String getFileName() throws UnsupportedEncodingException {
//		String fileRealName = new String(this.fileName.getBytes(), "ISO-8859-1");
//		return fileRealName;
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	// 返回一个输入流，作为一个客户端来说是一个输入流，但对于服务器端是一个 输出流
	public InputStream getDownloadFile() throws Exception {
		System.out.println("fileName=" + getFileName());
		InputStream inputStream = ServletActionContext.getServletContext().getResourceAsStream(
				"/upload/" + getFileName());
		System.out.println("inputStream:" + inputStream);
		return inputStream;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
