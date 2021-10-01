package discord.like.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import discord.dao.UserDao;
import discord.like.dto.LoginDto;
import discord.model.UserModel;



@Controller
@RequestMapping("/login")
public class LoginController {
	
	private UserDao userDao;

	@GetMapping
	public String login(Model model) {
		
		return "login";
	}
	
	@PostMapping
	public String login(LoginDto formLogin, Model model) {
		
		if(formLogin.getUsername() != null && formLogin.getPassword() !="") {
		UserModel user = userDao.login(formLogin.getUsername(), formLogin.getPassword());
		model.addAttribute("username",user.getPrenom());
		model.addAttribute("password",user.getPrenom());
		
		
	}
		
		return "home";
	}
}
