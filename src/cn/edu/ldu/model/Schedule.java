package cn.edu.ldu.model;

import java.util.Date;

/**
 * Schedule entity. @author MyEclipse Persistence Tools
 */

public class Schedule implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private Date date;
	private String thing;

	// Constructors

	/** default constructor */
	public Schedule() {
	}

	/** full constructor */
	public Schedule(String userName, Date date, String thing) {
		this.userName = userName;
		this.date = date;
		this.thing = thing;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getThing() {
		return this.thing;
	}

	public void setThing(String thing) {
		this.thing = thing;
	}

}