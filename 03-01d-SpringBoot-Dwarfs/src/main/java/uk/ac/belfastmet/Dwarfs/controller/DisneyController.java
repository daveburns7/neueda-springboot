package uk.ac.belfastmet.Dwarfs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.Dwarfs.domain.Dwarf;
import uk.ac.belfastmet.Dwarfs.service.DwarfService;

@Controller
@RequestMapping("/")
public class DisneyController {

	@Autowired
	private DwarfService dwarfService;

	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney!");
		this.dwarfService = new DwarfService();
		model.addAttribute("dwarfs", this.dwarfService.getDisneyDwarfs());
		return "disneyPage";
	}
}