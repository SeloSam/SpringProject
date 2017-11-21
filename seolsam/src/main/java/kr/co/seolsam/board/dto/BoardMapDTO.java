package kr.co.seolsam.board.dto;

import java.util.Date;

public class BoardMapDTO {
	
	private String mapName=null;
	private String mapType=null;
	private String fileYn=null;
	private String commentYn=null;
	private String delYn=null;
	
	private Integer mapId=null;
	private Integer parMapId=null;
	private Integer boardOreder=null;
	
	private Date regDt=null;

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public String getMapType() {
		return mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	public String getFileYn() {
		return fileYn;
	}

	public void setFileYn(String fileYn) {
		this.fileYn = fileYn;
	}

	public String getCommentYn() {
		return commentYn;
	}

	public void setCommentYn(String commentYn) {
		this.commentYn = commentYn;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public Integer getMapId() {
		return mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	public Integer getParMapId() {
		return parMapId;
	}

	public void setParMapId(Integer parMapId) {
		this.parMapId = parMapId;
	}


	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	public Integer getBoardOreder() {
		return boardOreder;
	}

	public void setBoardOreder(Integer boardOreder) {
		this.boardOreder = boardOreder;
	}

	@Override
	public String toString() {
		return "BoardMapDTO [mapName=" + mapName + ", mapType=" + mapType + ", fileYn=" + fileYn + ", commentYn="
				+ commentYn + ", delYn=" + delYn + ", mapId=" + mapId + ", parMapId=" + parMapId + ", boardOreder="
				+ boardOreder + ", regDt=" + regDt + "]";
	}
	
	
}
