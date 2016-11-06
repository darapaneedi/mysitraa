package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberHealthStatistics;

public interface MemberHealthStatsRepository extends CrudRepository<MemberHealthStatistics, Integer>{

	List<MemberHealthStatistics> findByCustomerIdOrderByStatisticsDateDesc(Integer memberId);
}
