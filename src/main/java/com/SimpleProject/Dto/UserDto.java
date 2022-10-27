package com.SimpleProject.Dto;

import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserDto {
	
	
	
	private String captcha ;
	
	private String hiddenCaptcha;
	
	private String image;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getHiddenCaptcha() {
		return hiddenCaptcha;
	}

	public void setHiddenCaptcha(String hiddenCaptcha) {
		this.hiddenCaptcha = hiddenCaptcha;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

		
	
	
	
}
