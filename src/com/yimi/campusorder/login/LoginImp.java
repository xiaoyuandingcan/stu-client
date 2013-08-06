package com.yimi.campusorder.login;

/**
 * @author Flex.Zang 2013-8-4
 */
public class LoginImp implements ILogin {
	private String userName;
	private String passWord;

	public LoginImp(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public String logIn() {
		String uuid = "";
		return uuid;
	}

	public void logOut() {

	}
}
