package discord.like.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import discord.like.dto.ServerDto;
import discord.model.ServerModel;
import discord.model.UserModel;
import discord.service.IServerService;
import discord.service.IUserService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private IServerService srvServer;
	@Autowired
	private IUserService srvUser;
	
	@GetMapping
	public String findAll(Model model) {
		List<ServerModel> mesServers = this.srvServer.findAllServer();		
		model.addAttribute("servers", mesServers);
		List<UserModel> mesUsers = this.srvUser.findAllUser();
		model.addAttribute("users", mesUsers);	
		return "home";
	}
	
	@GetMapping("/ajouterserver")
	public String add(Model model) {		
		return "addserver";
	}
	
	@PostMapping("/ajouterserver")
	@Transactional
	public String add(ServerDto formServer) {
		srvServer.saveServer(new ServerModel(formServer.getNom()));
		return "redirect:/home";
	}
	@Transactional
	@GetMapping("/supprimeserver")
	public String supprimer(@RequestParam int id) {
		this.srvServer.deleteServer(id);
		
		return "redirect:/home";
	}
	@GetMapping("/modifierserver")
	public String modify(Model model,@RequestParam Integer id) {
		ServerModel server = srvServer.findServer(id);
		model.addAttribute("nom",server.getNom());
		return "addserver";
	}
	@PostMapping("/modifierserver")
	@Transactional
	public String modify(@RequestParam int id, ServerDto formServer) {
		ServerModel monServer = this.srvServer.findServer(id);
		monServer.setNom(formServer.getNom());
		this.srvServer.saveServer(monServer);
//		srvServer.saveServer(new ServerModel(formServer.getNom()));
		return "redirect:/home";
	}
}

