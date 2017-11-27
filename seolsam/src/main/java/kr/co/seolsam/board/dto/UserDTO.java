package kr.co.seolsam.board.dto;

import java.util.Date;

public class UserDTO {
	private String email = null;
	private String name = null;
	private String lgnId = null;
	private String lgnPw = null;
	private String phone = null;
	private String role = "USER";
	
	private Integer userId = null;
	private Integer status = 9;
	
	private Date regDt = null;

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLgnId() {
		return lgnId;
	}

	public void setLgnId(String lgnId) {
		this.lgnId = lgnId;
	}

	public String getLgnPw() {
		return lgnPw;
	}

	public void setLgnPw(String lgnPw) {
		this.lgnPw = lgnPw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	@Override
	public String toString() {
		return "UserDTO [email=" + email + ", name=" + name + ", lgnId=" + lgnId + ", lgnPw=" + lgnPw + ", phone="
				+ phone + ", role=" + role + ", userId=" + userId + ", status=" + status + ", regDt=" + regDt + "]";
	}

	
	

}
