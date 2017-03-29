package cn.edu.ldu.model;

/**
 * Friends entity. @author MyEclipse Persistence Tools
 */

public class Friends implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String friendName;
	private String friendPhone;
	private String friendEmail;
	private String friendPlace;

	// Constructors

	/** default constructor */
	public Friends() {
	}

	/** full constructor */
	public Friends(String userName, String friendName, String friendPhone,
			String friendEmail, String friendPlace) {
		this.userName = userName;
		this.friendName = friendName;
		this.friendPhone = friendPhone;
		this.friendEmail = friendEmail;
		this.friendPlace = friendPlace;
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

	public String getFriendName() {
		return this.friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getFriendPhone() {
		return this.friendPhone;
	}

	public void setFriendPhone(String friendPhone) {
		this.friendPhone = friendPhone;
	}

	public String getFriendEmail() {
		return this.friendEmail;
	}

	public void setFriendEmail(String friendEmail) {
		this.friendEmail = friendEmail;
	}

	public String getFriendPlace() {
		return this.friendPlace;
	}

	public void setFriendPlace(String friendPlace) {
		this.friendPlace = friendPlace;
	}

}