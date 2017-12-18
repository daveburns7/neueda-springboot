package uk.ac.belfastmet.TitanicDatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.TitanicDatabase.domain.Passenger;
import uk.ac.belfastmet.TitanicDatabase.repository.PassengersRepository;

@Service
public class PassengerRestServiceImpl implements PassengerRestService {

	@Autowired
	private PassengersRepository passengersRepository;

	public PassengerRestServiceImpl(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}

	@Override
	public Iterable<Passenger> list() {

		return this.passengersRepository.findAll();
	}

	@Override
	public Passenger create(Passenger passenger) {

		return this.passengersRepository.save(passenger);
	}

	@Override
	public Passenger read(Integer passengerId) {

		return this.passengersRepository.findOne(passengerId);
	}

	@Override
	public Passenger update(Integer passengerId, Passenger passenger) {

		Passenger passengerToUpdate = this.passengersRepository.findOne(passengerId);
		return passengersRepository.save(passengerToUpdate);
	}

	@Override
	public void delete(Integer passengerId) {
		this.passengersRepository.delete(passengerId);
	}

	@Override
	public Passenger update(Integer passegnerId) {
		return null;
	}
}
