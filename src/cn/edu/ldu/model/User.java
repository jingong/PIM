package cn.edu.ldu.model;

import java.util.Date;

import javax.persistence.Id;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private String password1;
	private Date birth;
	private String location;
	private String email;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	/** full constructor */
	public User(Integer id, String userName, String password, Date birth,
			String location, String email) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.birth = birth;
		this.location = location;
		this.email = email;
	}

	// Property accessors
	@Id
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}