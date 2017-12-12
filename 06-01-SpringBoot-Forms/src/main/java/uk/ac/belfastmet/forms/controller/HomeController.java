package uk.ac.belfastmet.forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class HomeController {

	@GetMapping("/")
	public String home() {
		return "FormPage";
	}

	@PostMapping("/results")
	public String results(@RequestParam("firstname") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("gender") String gender, Model model) {

		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("gender", gender);
		return "ResultPage";
	}

	@GetMapping("/results")
	public String getResults(Model model) {

		model.addAttribute("firstName", "Lean-Luc");
		model.addAttribute("lastName", "Picard");
		model.addAttribute("gender", "Many of them");
		return "ResultPage";
	}

}
