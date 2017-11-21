package kr.co.seolsam.gugu.service;

import java.util.List;

import kr.co.seolsam.gugu.dto.GuguDTO;

public interface IGuguService {
	public List<GuguDTO> gugu(int dan, int row);
}
