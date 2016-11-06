package com.rubiklife.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubiklife.entities.Articles;
import com.rubiklife.entities.DietitianNotes;
import com.rubiklife.entities.MemberNutritionBreakdown;
import com.rubiklife.entities.MemberProductUses;
import com.rubiklife.repositories.ArticlesRepository;
import com.rubiklife.repositories.DietitianNotesRepository;
import com.rubiklife.repositories.MemberNutritionBreakdownRepository;
import com.rubiklife.repositories.MemberProductUsesRepository;

@RestController
public class GeneralApi {
	
	@Autowired
	private ArticlesRepository articlesRepository;
	

	@Autowired
	private MemberNutritionBreakdownRepository memberNutritionBreakdownRepository;
	
	@Autowired
	private MemberProductUsesRepository memberProductUsesRepository;
	
	@Autowired
	private DietitianNotesRepository dietitianNotesRepository;
	

	@RequestMapping("/articles")
	public List<Articles> getArticles(){
		return articlesRepository.findAll();
	}
	

	@RequestMapping("/nutritionbreakdown")
	public List<MemberNutritionBreakdown> getNutritionDetails(){
		return memberNutritionBreakdownRepository.findAll();
	}
	
	@RequestMapping("/dietitianNotes")
	public List<DietitianNotes> getdietitionNotes(){
		return dietitianNotesRepository.findAll();
	}
	
	@RequestMapping("/productUses")
	public List<MemberProductUses> getProductDetails(){
		return memberProductUsesRepository.findAll();
	}
}
