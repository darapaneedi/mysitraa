package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberToDos;

public interface MemberToDosRepository extends CrudRepository<MemberToDos, Integer>{

	List<MemberToDos> findByMemberId(Integer memberId);
}
