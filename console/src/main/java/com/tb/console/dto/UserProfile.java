package com.tb.console.dto;

/*
 * {
  "status": "success",
  "data": {
    "user_id": "AB1234",
    "user_type": "individual",
    "email": "xxxyyy@gmail.com",
    "user_name": "AxAx Bxx",
    "broker": "ZERODHA"
  }
}
 */

public class UserProfile {
	
	private String userId;
	private String userType;
	private String email;
	private String userName;
	private String broker;
	
	public UserProfile(String userId, String userType, String email, String userName, String brker) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.email = email;
		this.userName = userName;
		this.broker = brker;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", userType=" + userType + ", email=" + email + ", userName="
				+ userName + ", broker=" + broker + "]";
	}
	
	public static UserProfile dummyBuilder(String userId, String userType, String email, String userName, String brker) {
		return new UserProfile(userId, userType, email, userName, brker);
	}
}
