package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberRetailExp;

public interface MemberRetailExpRepository extends CrudRepository<MemberRetailExp, Integer>{
	
	List<MemberRetailExp> findByCustomerId(Integer memberId);

}
