package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberHealtGoals;

public interface MemberHealtGoalsRepository extends CrudRepository<MemberHealtGoals, Integer>{

	List<MemberHealtGoals> findByCustomerId(Integer memberId);
}
