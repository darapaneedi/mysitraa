package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberPointsStatistics;

public interface MemberPointsStatisticsRepository extends CrudRepository<MemberPointsStatistics, Integer>{

	List<MemberPointsStatistics> findByCustomerId(Integer memberId);
}
