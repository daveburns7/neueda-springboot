package uk.ac.belfastmet.TitanicDatabase.service;

import uk.ac.belfastmet.TitanicDatabase.domain.Passenger;

public interface PassengerRestService {

	Iterable<Passenger> list();

	Passenger create(Passenger passenger);

	Passenger read(Integer passenger);

	Passenger update(Integer passegnerId, Passenger passenger);

	void delete(Integer passengerId);

}
