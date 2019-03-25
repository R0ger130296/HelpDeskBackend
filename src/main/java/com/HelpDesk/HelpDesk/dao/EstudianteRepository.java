package com.HelpDesk.HelpDesk.dao;

import org.springframework.data.repository.CrudRepository;

import com.HelpDesk.HelpDesk.model.Estudiante;


public interface EstudianteRepository  extends CrudRepository<Estudiante, Long> {

	@SuppressWarnings("unchecked")
	Estudiante save (Estudiante gestionEstudiante);
}
