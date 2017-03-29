package cn.edu.ldu.model;

/**
 * File entity. @author MyEclipse Persistence Tools
 */

public class File implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String fileTitle;
	private String fileType;
	private String fileName;
	private String filePath;

	// Constructors

	/** default constructor */
	public File() {
	}

	/** full constructor */
	public File(String userName, String fileTitle, String fileType,
			String fileName, String filePath) {
		this.userName = userName;
		this.fileTitle = fileTitle;
		this.fileType = fileType;
		this.fileName = fileName;
		this.filePath = filePath;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFileTitle() {
		return this.fileTitle;
	}

	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}