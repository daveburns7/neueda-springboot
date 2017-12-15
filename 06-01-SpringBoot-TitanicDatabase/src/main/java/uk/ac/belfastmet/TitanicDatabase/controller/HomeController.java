package uk.ac.belfastmet.TitanicDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@PostMapping("/search")
	public String search(Model model) {
		model.addAttribute("pageTitle", "Search Passengers");
		model.addAttribute("passengers", passengersRepository.findAll());
		return "passengerPage";
	}

	@PostMapping("/search1")
	public String search(@RequestParam("searchString") String searchString, Model model) {
		model.addAttribute("pageTitle", "Search Passengers");
		model.addAttribute("passengers", passengersRepository.findByPclass(1));
		return "passengerPage";
	}

	@PostMapping("/search2")
	public String search(@RequestParam("searchString") String searchField,
			@RequestParam("searchString") String searchString, Model model) {

		if (searchField.equals("name")) {
			model.addAttribute("pageTitle", "Search Passengers");
			model.addAttribute("passengers", passengersRepository.findByName(searchString));

		} else if (searchField.equals("embarked")) {
			model.addAttribute("pageTitle", "Search Passengers");
			model.addAttribute("passengers", passengersRepository.findByEmbarked(searchString));

		} else if (searchField.equals("passengerClass")) {
			Integer pClass = Integer.parseInt(searchString);
			model.addAttribute("pageTitle", "Search Passengers");
			model.addAttribute("passengers", passengersRepository.findByPclass(pClass));
		}
		return "passengerPage";
	}
}
