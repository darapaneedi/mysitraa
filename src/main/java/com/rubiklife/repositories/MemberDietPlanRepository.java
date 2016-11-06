package com.rubiklife.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberDietPlan;

public interface MemberDietPlanRepository extends CrudRepository<MemberDietPlan, Integer>{

	MemberDietPlan findByCustomerId(Integer memberId);
}
