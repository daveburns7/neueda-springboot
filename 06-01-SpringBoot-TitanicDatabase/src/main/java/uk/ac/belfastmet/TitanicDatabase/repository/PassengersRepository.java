package uk.ac.belfastmet.TitanicDatabase.repository;


import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicDatabase.domain.Passenger;

public interface PassengersRepository extends CrudRepository<Passenger, Integer> {
	
	Iterable<Passenger> findByPclass(Integer i);

	Iterable<Passenger> findByName(String searchString);

	Iterable<Passenger> findByEmbarked(String searchString);

}
