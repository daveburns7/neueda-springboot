package uk.ac.belfastmet.TitanicDatabase.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.TitanicDatabase.domain.Passengers;

public interface PassengerRepository extends CrudRepository<Passengers, Integer> {

}
