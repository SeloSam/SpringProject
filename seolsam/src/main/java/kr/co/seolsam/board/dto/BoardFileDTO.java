package kr.co.seolsam.board.dto;

import java.util.Date;

public class BoardFileDTO {
	
	private String ext=null;
	private String orgFileName=null;
	private String filePath=null;
	private String newFileName=null;
	private String fileType=null;
	
	private Integer docId=null;
	private Integer fileId=null;
	private Integer fileSize=null;
	
	private Date regDt=null;

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getOrgFileName() {
		return orgFileName;
	}

	public void setOrgFileName(String orgFileName) {
		this.orgFileName = orgFileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	@Override
	public String toString() {
		return "BoardFileDTO [ext=" + ext + ", orgFileName=" + orgFileName + ", filePath=" + filePath + ", newFileName="
				+ newFileName + ", fileType=" + fileType + ", docId=" + docId + ", fileId=" + fileId + ", fileSize="
				+ fileSize + ", regDt=" + regDt + "]";
	}
	
	
	
}
