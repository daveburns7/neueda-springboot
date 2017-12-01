package uk.ac.belfastmet.TitanicDatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("pageTitle", "home!");
		return "HomePage";

	}
}