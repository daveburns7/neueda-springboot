package uk.ac.belfastmet.DwarfsSaved.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.ArrayList;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.DwarfsSaved.repository.DwarfRepository;

@Controller
@RequestMapping("/")
public class DisneyController {
	
	@Autowired
	DwarfRepository dwarfRepository;
	
	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney!");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor("Disney"));
		
		return "disneyPage";
	}
}