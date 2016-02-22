package com.thoughtscript.javafullstack.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thoughtscript.javafullstack.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.GET)
	@ResponseBody
	public String authenticateUser(@RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password) {
		if (StringUtils.isNotEmpty(email) && StringUtils.isNotEmpty(password)) {
			return email + " authenticated:" + String.valueOf(userService.authenticate(email, password));
		} else {
			return email + " authenticated:" + String.valueOf(false);
		}
	}
}