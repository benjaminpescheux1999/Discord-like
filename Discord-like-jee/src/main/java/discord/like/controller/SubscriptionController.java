package discord.like.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import discord.like.dto.UserDto;

@Controller
@RequestMapping("/subscription")
public class SubscriptionController {	
	
	@GetMapping
	public String subscription(Model model) {
		
		return "subscription";
	}

	@PostMapping
	public String subscription(UserDto formSubscription, Model model) {
		
		model.addAttribute("nom",formSubscription.getNom());
		model.addAttribute("prenom",formSubscription.getPrenom());
		model.addAttribute("password",formSubscription.getPassword());
			
		return "home";
	}
}

