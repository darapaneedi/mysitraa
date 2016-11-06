package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberNutritionBreakdown;

public interface MemberNutritionBreakdownRepository extends CrudRepository<MemberNutritionBreakdown, Integer>{

	List<MemberNutritionBreakdown> findAll();
}
