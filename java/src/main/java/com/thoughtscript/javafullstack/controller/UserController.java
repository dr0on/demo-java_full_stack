package com.thoughtscript.javafullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@Autowired
	com.thoughtscript.javafullstack.services.Auth auth;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap map) {
		map.put("msg", "Hello Spring 4 Web MVC!");
		return "index";
	}
}