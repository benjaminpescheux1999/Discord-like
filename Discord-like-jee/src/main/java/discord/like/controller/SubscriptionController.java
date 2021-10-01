package discord.like.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import discord.dao.IUserDao;
import discord.like.dto.UserDto;
import discord.model.UserModel;

@Controller
@RequestMapping("/subscription")
public class SubscriptionController {	
	
	@Autowired
	private IUserDao userDao;
	
	@GetMapping
	public String subscription(Model model) {
		
		return "subscription";
	}

	@PostMapping
	@Transactional
	public String subscription(UserDto formSubscription, Model model) {
		String retour="subscription";
		if(formSubscription.getNom() != "" && formSubscription.getPrenom() != "" && formSubscription.getPassword() != "" && formSubscription.getMail() != "" ) {
			try {
				if(userDao.findByMail(formSubscription.getMail()) == null) {
						
				}
				
			}catch(Exception e){
				userDao.save(new UserModel(formSubscription.getNom(),formSubscription.getPrenom(),formSubscription.getPassword(),formSubscription.getMail()));
				model.addAttribute("username",formSubscription.getPrenom());
				model.addAttribute("password",formSubscription.getPassword());
				
				return "redirect:/home";
				
			}
				
			
		}

		return retour;
	}
}

