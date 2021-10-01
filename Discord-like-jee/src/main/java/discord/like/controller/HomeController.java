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
import discord.service.IServerService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private IServerService srvServer;
	
	@GetMapping
	public String findAll(Model model) {
		List<ServerModel> mesServers = this.srvServer.findAll();		
		model.addAttribute("servers", mesServers);		
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
//	@GetMapping("/modifierserver")
//	public String modify(Model model,@RequestParam Integer id) {
//		Produit produit = srvProduit.findById(id);
//		model.addAttribute("libelle",produit.getLibelle());
//		model.addAttribute("prix",produit.getprix());
//
//		return "ajouter";
//	}
//	@PostMapping("/modifier")
//	public String modify(@RequestParam Integer id, ProduitDto produitdto) {
//		Produit monProduit = new Produit(id,produitdto.getLibelle(),produitdto.getPrix());
//		this.srvProduit.save(monProduit);
//		
//		return "redirect:/produit";
//	}
}

