package discord.like.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import discord.like.dto.LoginDto;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping
	public String login() {
		return "login";
	}
	@PostMapping
	public String login(LoginDto login, Model model) {
		model.addAttribute("utilisateur", login.getUsername());
		model.addAttribute("password", login.getPassword());

		return "home";
	}
}
