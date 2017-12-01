package kr.co.seolsam.board.dto;

import kr.co.seolsam.common.dto.PageDTO;

public class BoardSearchDTO extends PageDTO{

	private Integer mapId = null;
	private String searchText = null;
	private String searchType = null;
	
	public Integer getMapId() {
		return mapId;
	}
	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
}
