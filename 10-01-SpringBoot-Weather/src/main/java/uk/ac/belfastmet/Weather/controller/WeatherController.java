package uk.ac.belfastmet.Weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.Weather.domain.TodaysWeather;
import uk.ac.belfastmet.Weather.service.WeatherService;

@Controller
@RequestMapping("/")
public class WeatherController {

	@Autowired
	WeatherService weatherservice;

	private TodaysWeather todaysWeather;

	@GetMapping("/")
	@ResponseBody
	public String home(Model model) {

		model.addAttribute("pageTitle", "Weather");
		this.weatherservice = new WeatherService(null);
		this.todaysWeather = weatherService.getTodaysWeather();
		return this.todaysWeather.getWeather;
	}

}
