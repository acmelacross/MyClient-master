package com.txz.fwh.modle;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

public class TXZUsers extends BmobUser{
	private String userNumber;
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	private String userIp;
}