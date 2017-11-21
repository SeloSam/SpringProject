package kr.co.seolsam.gugu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.seolsam.gugu.dto.GuguDTO;
import kr.co.seolsam.gugu.service.IGuguService;

@Controller
public class GuguController {
	
	private static final Logger logger = LoggerFactory.getLogger(GuguController.class);
	
	@RequestMapping(value="/gugu/index", method=RequestMethod.GET)//web-inf/views/gugu folder
	public void index() {
		
	}
	
	@Autowired private IGuguService gs= null;
	
	@RequestMapping(value="/gugu/gugu", method=RequestMethod.GET)
	public void gugu(int dan, int row, Model model) {
		
		logger.debug("dan==>"+dan);
		
		List<GuguDTO> list = gs.gugu(dan,row);
		model.addAttribute("list", list);
		model.addAttribute("dan", dan);
		model.addAttribute("row", row);
		//<List>				 <Array>
		/*GuguServiceImpl gs= new GuguServiceImpl();
		logger.debug("result==>" +gugudan);*/
	}
}
