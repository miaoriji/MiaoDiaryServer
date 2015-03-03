package com.softfz.model;

/**
 * 用户实体bean
 * @author Administrator
 *
 */
public class UserBean implements BaseBean{

	private static final long serialVersionUID = 1L;
	private long userId;
	private String account;
	private String password;
	private String createTime;
	private String updateTime;
	private int isVaild;
	private String nickname;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public int getIsVaild() {
		return isVaild;
	}
	public void setIsVaild(int isVaild) {
		this.isVaild = isVaild;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public UserBean(long userId, String account, String password,
			String createTime, String updateTime, int isVaild, String nickname) {
		super();
		this.userId = userId;
		this.account = account;
		this.password = password;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isVaild = isVaild;
		this.nickname = nickname;
	}
	
	public UserBean(){
		
	}
}
