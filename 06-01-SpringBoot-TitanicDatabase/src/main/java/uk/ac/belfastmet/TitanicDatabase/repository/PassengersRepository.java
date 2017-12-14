package uk.ac.belfastmet.TitanicDatabase.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicDatabase.domain.Passenger;

public interface PassengersRepository extends CrudRepository<Passenger, Integer> {
	
	ArrayList<Passenger> findByPclass(Integer i);

}
