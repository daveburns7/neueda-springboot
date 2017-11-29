package uk.ac.belfastmet.Dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/")
	public String demo(Model model) {

		return "test";
	}

	@GetMapping("/bingo")
	public String bingo(Model model) {

		return "There was a dog in our back yard";
	}

	@GetMapping("/princess")
	public String princess(Model model) {

		return "Meghan Markle";
	}

}
