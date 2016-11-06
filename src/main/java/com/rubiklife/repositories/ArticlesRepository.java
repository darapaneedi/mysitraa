package com.rubiklife.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubiklife.entities.Articles;

public interface ArticlesRepository extends CrudRepository<Articles, Integer>{

	List<Articles> findAll();
}
