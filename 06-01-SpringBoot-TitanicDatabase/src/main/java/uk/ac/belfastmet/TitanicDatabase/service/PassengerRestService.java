package uk.ac.belfastmet.TitanicDatabase.service;

import uk.ac.belfastmet.TitanicDatabase.domain.Passenger;

public interface PassengerRestService {

	Iterable<Passenger> list();

	Passenger create(Passenger passenger);

	Passenger read(Integer passenger);

	Passenger update(Integer passegnerId);

	void delete(Integer passengerId);

	Passenger update(Integer passengerId, Passenger passenger);
	
}
