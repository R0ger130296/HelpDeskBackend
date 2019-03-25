package com.HelpDesk.HelpDesk.dao;

import org.springframework.data.repository.CrudRepository;

import com.HelpDesk.HelpDesk.model.Genero;

public interface GeneroRepository extends CrudRepository<Genero , Long> {

	@SuppressWarnings("unchecked")
	Genero save (Genero gestionGenero);
}
