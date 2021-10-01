package discord.like.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//	@RequestMapping(value= "/home", method= RequestMethod.GET)
	@GetMapping("/home")
public String home(@RequestParam String utilisateur,@RequestParam String password, HttpServletRequest req,Model model) {
	System.out.println("coucou");
//	model.addAttribute("utilisateur", utilisateur);
//	model.addAttribute("password", password);
	return "home";
	}
	@GetMapping("/liste-users")
	public String users(Model model) {
		List<String> users =Arrays.asList("toto","Albert","Dupond", "Marion");
		model.addAttribute("utilisateurs", users);
		return "home";
	}
}

