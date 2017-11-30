package uk.ac.belfastmet.LargestBuildings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/floorarea")

public class FloorAreaController {
	@GetMapping("/")
	public String floorArea(Model model) {
		model.addAttribute("pageTitle", "FloorArea!");
		return "FloorArea";
	}

}
