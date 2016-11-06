package com.rubiklife.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Integer>{
	
	
	Member findByEmail(String email);
	

}
