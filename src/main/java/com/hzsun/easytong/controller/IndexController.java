package com.hzsun.easytong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/login")
	public String index(HttpServletRequest req, Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/layout")
	public String test(HttpServletRequest req, Model model) {
		return "default.template";
	}
}
