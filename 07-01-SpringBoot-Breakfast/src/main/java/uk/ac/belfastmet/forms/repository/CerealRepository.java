package uk.ac.belfastmet.forms.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.forms.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer> {

}
