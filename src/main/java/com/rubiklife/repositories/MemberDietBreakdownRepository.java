package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberDietBreakdown;

public interface MemberDietBreakdownRepository extends CrudRepository<MemberDietBreakdown, Integer>{
	
	List<MemberDietBreakdown> findByCustomerId(Integer customerId);
	
	List<MemberDietBreakdown> findAll();
	
}

