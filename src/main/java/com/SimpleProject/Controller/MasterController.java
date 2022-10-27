package com.SimpleProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SimpleProject.CaptchaUtil.CaptchaUtil;
import com.SimpleProject.Dto.UserDto;

@Controller
public class MasterController {
	
	@RequestMapping("/")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		UserDto dto = new UserDto();
		CaptchaUtil.populateCaptcha(dto);
		modelAndView.addObject("captcha", dto);
		return modelAndView;
	}
}
