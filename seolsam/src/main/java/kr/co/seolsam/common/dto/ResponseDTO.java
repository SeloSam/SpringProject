package kr.co.seolsam.common.dto;

/**
 *	@code 
 * 	99 = 성공
 * 	-1 = 실패
 * 	@author admin 
 **/

public class ResponseDTO {
	private int code=99;
	private String msg="성공하였습니다.";
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}	
}
