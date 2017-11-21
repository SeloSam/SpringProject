package kr.co.seolsam.board.dto;

import java.util.Date;

public class BoardCommentDTO {
	
	private Integer commentId=null;
	private Integer userId=null;
	private Integer docId=null;

	private String boardComment=null;
	
	private Date regDt=null;
	
	

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
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

	public String getBoardComment() {
		return boardComment;
	}

	public void setBoardComment(String boardComment) {
		this.boardComment = boardComment;
	}

	
	@Override
	public String toString() {
		return "BoardCommentDTO [commentId=" + commentId + ", userId=" + userId + ", docId=" + docId + ", boardComment="
				+ boardComment + ", regDt=" + regDt + "]";
	}

	
	
	
	

	

}
