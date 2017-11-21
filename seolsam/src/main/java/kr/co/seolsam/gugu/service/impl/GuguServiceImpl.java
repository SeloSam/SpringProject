package kr.co.seolsam.gugu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.seolsam.gugu.dto.GuguDTO;
import kr.co.seolsam.gugu.service.IGuguService;

@Service
public class GuguServiceImpl implements IGuguService {
	
	private static final Logger logger= LoggerFactory.getLogger(GuguServiceImpl.class);
	
	@Override
	public List<GuguDTO> gugu(int dan, int row) {
		logger.debug("dan==>" + dan);
		
		List<GuguDTO> list = new ArrayList<GuguDTO>();
		
		
		for(int i=1; i<=row; i++) {

			GuguDTO guguDTO = new GuguDTO();
			
			guguDTO.setDan(dan);
			String arrdan = String.valueOf(dan);
			String arrDan[] = arrdan.split("");
			guguDTO.setArrDan(arrDan);
			
			
			guguDTO.setRow(i);
			String arrrow = String.valueOf(i);
			String arrRow[] = arrrow.split("");
			guguDTO.setArrRow(arrRow);
			
			guguDTO.setResult(dan*i);
			String result = String.valueOf(guguDTO.getResult());
			String arrResult[]=result.split("");
			guguDTO.setArrResult(arrResult);
			
			for(String obj:arrResult){
				logger.debug("obj ==>" +obj);
			}
			
			list.add(guguDTO);
		}
		return list;
	}
}
