package com.softfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录界面
 * @author Administrator
 *
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String index(){
		return "login/index";
	}
}
