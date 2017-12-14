package uk.ac.belfastmet.TitanicDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.TitanicDatabase.repository.PassengersRepository;

@Controller
@RequestMapping("/")

public class HomeController {

	@Autowired
	PassengersRepository passengersRepository;
	
	public HomeController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}

			@GetMapping("/")
	public String allPassengers(Model model) {
		model.addAttribute("pageTitle", "All Titanic Passengers!");
		model.addAttribute("passengers", passengersRepository.findAll());
		return "HomePage";
	}
	
	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("pageTitle", "ViewPage");
		return "ViewPage";
	}
	
	@GetMapping("/edit")
	public String edit(Model model) {
		model.addAttribute("pageTitle", "EditPage");
		return "EditPage";
	}
}
