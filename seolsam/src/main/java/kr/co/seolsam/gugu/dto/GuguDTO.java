package kr.co.seolsam.gugu.dto;

public class GuguDTO {
	
	private int dan = 0;
	private int row = 0;
	private int result = 0;
	
	private String[] arrResult = null;
	private String[] arrDan=null;
	private String[] arrRow=null;
	
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	
	public String[] getArrResult() {
		return arrResult;
	}
	public void setArrResult(String[] arrResult) {
		this.arrResult = arrResult;
	}
	public String[] getArrDan() {
		return arrDan;
	}
	public void setArrDan(String[] arrDan) {
		this.arrDan = arrDan;
	}
	public String[] getArrRow() {
		return arrRow;
	}
	public void setArrRow(String[] arrRow) {
		this.arrRow = arrRow;
	}
	
	
	
	
	
}
