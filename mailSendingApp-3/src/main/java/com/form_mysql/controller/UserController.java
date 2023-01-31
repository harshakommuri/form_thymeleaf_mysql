package com.form_mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form_mysql.entity.UserDtls;
import com.form_mysql.repository.userRepository;

@Controller
public class UserController {
	
	@Autowired
	private userRepository repo;

	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDtls u) {
		
		System.out.println(u);
		repo.save(u);
		//session.setAttribute("message", "user register sucessesful");
		return "redirect:/";
	}
}
