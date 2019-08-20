package com.codingdojo.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.languages.models.Language;


@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();
	List<Language> findByDescriptionContaining(String search);
	Long countByNameContaining(String search);
	// this method deletes a book that starts with a specific title
	Long deleteByNameStartingWith(String search);
}