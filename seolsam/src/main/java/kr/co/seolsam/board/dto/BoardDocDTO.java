package kr.co.seolsam.board.dto;

import java.util.Date;

public class BoardDocDTO {
	
	private String title=null;
	private String boardContents=null;
	private String name=null;

	private Integer userId=null;
	private Integer mapId=null;
	private Integer cntRead=0;
	private Integer docId=null;
	private Date regDt=null;

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoardContents() {
		return boardContents;
	}

	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMapId() {
		return mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	public Integer getCntRead() {
		return cntRead;
	}

	public void setCntRead(Integer cntRead) {
		this.cntRead = cntRead;
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
		return "BoardDocDTO [title=" + title + ", boardContents=" + boardContents + ", userId=" + userId + ", mapId="
				+ mapId + ", cntRead=" + cntRead + ", docId=" + docId + ", regDt=" + regDt + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	


	

}
