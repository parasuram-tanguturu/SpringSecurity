package com.springboot.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getHome() {
		return ("<h1> Welcome home </h1>");
	}

	@GetMapping("/user")
	public String getUserHome() {
		return ("<h1> Welcome User Home </h1>");
	}
	
	@GetMapping("/admin")
	public String getAdminHome() {
		return ("<h1> Welcome Admin home</h1");
	}
}
