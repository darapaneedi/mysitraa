package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.DietitianNotes;

public interface DietitianNotesRepository extends CrudRepository<DietitianNotes, Integer>{

	List<DietitianNotes> findAll();
}
