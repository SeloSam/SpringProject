package kr.co.seolsam.common.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.seolsam.common.dto.HomeDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)//메소?��
	public String home(Locale locale, Model model) {
		logger.debug("home==>");
		return "redirect:./index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		logger.debug("index====>");
		return "redirect:./login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		logger.debug("login====>");
		return "login";
	}
	
	
	
	
	
	
	@RequestMapping(value="/main/index", method=RequestMethod.GET)
	public void main(HomeDTO homeDTO, Model model) {
		logger.debug("name==>"+homeDTO.getName());
		logger.debug("age==>"+homeDTO.getAge());
		
		model.addAttribute("homeDTO", homeDTO);
	}
	
	
	
}
