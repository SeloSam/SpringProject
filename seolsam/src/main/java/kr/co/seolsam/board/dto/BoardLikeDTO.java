package kr.co.seolsam.board.dto;

import java.util.Date;

public class BoardLikeDTO {
	private String likeYn=null;
	private Integer userId=null;
	private Integer docId=null;
	private Date regDt=null;
	
	public String getLikeYn() {
		return likeYn;
	}
	public void setLikeYn(String likeYn) {
		this.likeYn = likeYn;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	@Override
	public String toString() {
		return "BoardLikeDTO [likeYn=" + likeYn + ", userId=" + userId + ", docId=" + docId + ", regDt=" + regDt + "]";
	}

	
	
}
