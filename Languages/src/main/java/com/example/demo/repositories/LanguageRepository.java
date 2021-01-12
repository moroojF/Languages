package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
    List<Language> findAll();
    List<Language> findByCreatorContaining(String search);
    Long countByNameContaining(String search);
    Long deleteByNameStartingWith(String search);
}
