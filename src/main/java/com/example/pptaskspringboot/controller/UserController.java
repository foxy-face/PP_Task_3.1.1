package com.example.pptaskspringboot.controller;

import com.example.pptaskspringboot.model.User;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("")
	public String showUserInfo(@CurrentSecurityContext(expression = "authentication.principal") User principal,
							   Model model) {
		model.addAttribute("user", principal);
		return "/show";
	}
}