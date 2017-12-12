package uk.ac.belfastmet.TitanicDatabase.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicDatabase.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

}
