package uk.ac.belfastmet.DwarfsSaved.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.DwarfsSaved.repository.DwarfRepository;

@Controller
@RequestMapping("/")
public class TolkienController {

	@Autowired
	DwarfRepository dwarfRepository;

	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor("Tolkien"));
		
		return "tolkienPage";
	}
}