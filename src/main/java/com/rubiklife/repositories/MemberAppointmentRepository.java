package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberAppointments;

public interface MemberAppointmentRepository extends CrudRepository<MemberAppointments, Integer>{

	List<MemberAppointments> findByMemberId(Integer memberId);
	
	List<MemberAppointments> findByDietitianId(Integer dititianId);
}
