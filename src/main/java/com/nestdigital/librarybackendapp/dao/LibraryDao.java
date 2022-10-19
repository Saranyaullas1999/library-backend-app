package com.nestdigital.librarybackendapp.dao;

import com.nestdigital.librarybackendapp.Model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
}
