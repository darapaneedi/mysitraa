package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.MemberProductUses;

public interface MemberProductUsesRepository extends CrudRepository<MemberProductUses, Integer>{

	List<MemberProductUses> findAll();
}
