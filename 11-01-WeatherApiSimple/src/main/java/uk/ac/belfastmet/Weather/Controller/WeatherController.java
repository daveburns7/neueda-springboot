package uk.ac.belfastmet.Weather.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.Weather.Domain.TodaysWeather;
import uk.ac.belfastmet.Weather.Domain.Weather;

@Controller
@RequestMapping("/")
public class WeatherController {

	@Value("${api.baseWeatherUrl}")
	private String baseWeatherUrl;

	public WeatherController() {
		super();

	}

	@GetMapping("/")
	public String home(Model model) {

		model.addAttribute("pageTitle", "Home");

		return "HomePage";
	}

	@GetMapping("/Belfast")
	public String belfast(Model model) {

		model.addAttribute("pageTitle", "Belfast");

		String belfastWeatherUrl = this.baseWeatherUrl + "belfast";
		System.out.println(belfastWeatherUrl);
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();

		model.addAttribute("weather", weather);

		return "Belfast";
	}

	@GetMapping("/Dublin")
	public String dublin(Model model) {

		model.addAttribute("pageTitle", "Dublin");

		String dublinWeatherUrl = this.baseWeatherUrl + "dublin";

		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(dublinWeatherUrl, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();

		model.addAttribute("weather", weather);

		return "Dublin";
	}

}
