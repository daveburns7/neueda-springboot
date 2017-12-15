package uk.ac.belfastmet.TitanicDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.TitanicDatabase.domain.Passenger;
import uk.ac.belfastmet.TitanicDatabase.service.PassengerRestService;

@RestController
@RequestMapping("/api/passenger")
public class PassengerRestController {

	@Autowired
	PassengerRestService passengerRestService;

	public PassengerRestController(PassengerRestService passengerService) {
		super();
		this.passengerRestService = passengerService;
	}

	@GetMapping("/")
	public Iterable<Passenger> list() {
		return passengerRestService.list();
	}
	
	@GetMapping("/")
	public Passenger create(@RequestBody Passenger passenger) {
		return passengerRestService.create(passenger);
	}

	@GetMapping("/{passengerId")
	public Passenger read(@PathVariable("passengerId") Integer passengerId) {
		return passengerRestService.read(passengerId);
	}

	@DeleteMapping("/{passengerId")
	public void delete(@PathVariable("passengerId") Integer passengerId) {
		passengerRestService.delete(passengerId);
	}
}
