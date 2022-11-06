package com.SimpleProject.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SimpleProject.CaptchaUtil.CaptchaUtil;
import com.SimpleProject.Dto.UserDto;

@Controller
public class MasterController {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		UserDto dto = new UserDto();
		CaptchaUtil.populateCaptcha(dto);
		modelAndView.addObject("captcha", dto);
		return modelAndView;
	}
	
	@RequestMapping("/captcha")
	public ResponseEntity<Map<String, String>> getCaptcha() {
		UserDto dto = new UserDto();
		CaptchaUtil.populateCaptcha(dto);
		Map<String, String> captchaProperty = new HashMap<>();
		captchaProperty.put("captchaImage", dto.getImage());
		captchaProperty.put("captchaHidden", dto.getHiddenCaptcha());
		return new ResponseEntity<Map<String,String>>(captchaProperty, HttpStatus.OK);
	}
	
	@GetMapping("/loginSuccess")
	public ModelAndView login_sucess() {
		
		return null;
		
	}
}
