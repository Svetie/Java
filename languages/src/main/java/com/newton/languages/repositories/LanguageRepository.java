package com.newton.languages.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.newton.languages.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long>{
    // this method retrieves all the books from the database
    List<Language> findAll();
}
