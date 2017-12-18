package uk.ac.belfastmet.Weather.service;

import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.Weather.domain.TodaysWeather;

public interface WeatherService {

	private String belfastWeatherUrl = "https://www.codingfury.net/training/weathersample/weather.php?location=belfast "; 
	private String dublinWeatherUrl = "https://www.codingfury.net/training/weathersample/weather.php?location=dublin ";
	private String londonWeatherUrl = "https://www.codingfury.net/training/weathersample/weather.php?location=london ";
	
	private RestTemplate restTemplate;
			
	public WeatherService(RestTemplate restTemplate) {
		super();
		this.restTemplate restTemplate;
	}
	
	public TodaysWeather getTodaysWeather() {
		String todaysWeather = this.belfastWeatherUrl;
		
		TodaysWeather todaysWeather = restTemplate.getForObject(todaysWeatherUrl, TodaysWeather.class);
			return todaysWeather;
	}
}
