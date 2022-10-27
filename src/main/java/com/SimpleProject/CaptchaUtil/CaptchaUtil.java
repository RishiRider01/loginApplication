package com.SimpleProject.CaptchaUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.SimpleProject.Dto.UserDto;

import cn.apiclub.captcha.Captcha;
import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;

public class CaptchaUtil {
	
//	creating captcha
	public static Captcha createCaptcha(int width, int height) {
		Captcha cap = new Captcha.Builder(width, height)
				.addBackground(new GradiatedBackgroundProducer())
				.addNoise()
				.addText()
				.build();
		return cap;
	}
	
	//converting into image
	public static String createImage(Captcha captcha) {
		
		String imageData= null;
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ImageIO.write(captcha.getImage(), "png", bos);
			byte[] arr = Base64.getEncoder().encode(bos.toByteArray());
			imageData = new String(arr);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return imageData;
	}
	
	public static void populateCaptcha(UserDto userDto) {
		Captcha captcha = createCaptcha(150, 50);
		userDto.setHiddenCaptcha(captcha.getAnswer());
		userDto.setCaptcha("");
		userDto.setImage(createImage(captcha));
	}
}
