package uk.ac.belfastmet.LargestBuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.LargestBuildings.service.BuildingService;
@Controller
@RequestMapping("/floorarea")

public class FloorAreaController {
	@Autowired
	private BuildingService floorareaService;

	@GetMapping("/")
	public String flStringoorArea(Model model) {
		model.addAttribute("pageTitle", "FloorArea!");
		this.floorareaService = new BuildingService();
		model.addAttribute("buildings", this.floorareaService.getFootprint());
		return "FloorArea";
	}

}
