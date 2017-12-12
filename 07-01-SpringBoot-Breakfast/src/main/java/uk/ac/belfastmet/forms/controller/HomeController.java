package uk.ac.belfastmet.forms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.forms.domain.Cereal;
import uk.ac.belfastmet.forms.repository.CerealRepository;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	CerealRepository cerealRepository;

	public HomeController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("cereals", cerealRepository.findAll());
		return "HomePage";
	}

	@GetMapping("/cereal/view/{cerealId}")
	public String viewCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "ViewCereal";
	}

	@GetMapping("/cereal/edit/{cerealId}")	
	public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Edit Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "EditCereal";
	}

	@GetMapping("/cereal/add/{cerealId}")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "EditCereal";
	}

	@PostMapping("/cereal/save")
	public String saveCereal(Cereal cereal) {
		Cereal savedCereal = cerealRepository.save(cereal);
		return "redirect:/cereal/view/" + savedCereal.getCerealID();
	}

	@GetMapping("/cereal/delete/{cerealId}")	
	public String deleteCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "Delete Cereal");
		cerealRepository.delete(cerealId);
		return "redirect:/";
	}
}
