package uk.ac.belfastmet.TitanicDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.TitanicDatabase.repository.PassengerRepository;

@Controller
@RequestMapping("/")
public class PassengerController {

	@Autowired
	PassengerRepository passengerRepository;

	@GetMapping("/")
	public String allPassengers(Model model) {
		model.addAttribute("pageTitle", "All Titanic Passengers!");
		model.addAttribute("passengers", passengerRepository.findAll());
		return "passengerPage";
	}
	
	@GetMapping("/first-class")
	public String firstClassPassengers(Model model) {
		model.addAttribute("pageTitle", "First Class Passengers!");
		model.addAttribute("passengers", passengerRepository.findByPclass(1));
		return "passengerPage";
	}
	
	@GetMapping("/passenger")
	public String survivedPassengers(Model model) {
		model.addAttribute("pageTitle", "Survivors!");
		model.addAttribute("passenger", passengerRepository.findBySurvived(2));
		return "passengerPage";
	}
}