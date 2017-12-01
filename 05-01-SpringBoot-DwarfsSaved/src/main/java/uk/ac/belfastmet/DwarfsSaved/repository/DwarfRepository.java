package uk.ac.belfastmet.DwarfsSaved.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.DwarfsSaved.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Iterable<Dwarf> findByAuthor(String string);
	
	Dwarf findByName(String string);
}
