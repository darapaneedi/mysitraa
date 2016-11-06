package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rubiklife.bo.DietitianBO;
import com.rubiklife.entities.MemberDietitian;

public interface MemberDietitianRepository extends CrudRepository<MemberDietitian, Integer>{

	@Query("select new com.rubiklife.bo.DietitianBO(a.primaryDietitian,b) from MemberDietitian a, Dietitian b where b.dietitianId = a.dietitianId and a.customerId=?")
	List<DietitianBO> findByCustomerId(Integer customerId);
}
