package org.cybercultura.repository;

import java.util.List;

import org.cybercultura.model.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends CrudRepository<Libro, Integer>{

	

}
