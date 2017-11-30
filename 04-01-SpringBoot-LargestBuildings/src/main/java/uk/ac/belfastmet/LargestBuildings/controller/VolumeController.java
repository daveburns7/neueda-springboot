package uk.ac.belfastmet.LargestBuildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.LargestBuildings.service.BuildingService;
@Controller
@RequestMapping("/volume")

public class VolumeController {
	@Autowired
	private BuildingService volumeService;

	@GetMapping("/")
	public String floorArea(Model model) {
		model.addAttribute("pageTitle", "Volume!");
		model.addAttribute("buildings", this.volumeService.getFootprint());
		return "Volume";
	}
}
