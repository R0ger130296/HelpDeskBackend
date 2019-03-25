package com.HelpDesk.HelpDesk.dao;

import org.springframework.data.repository.CrudRepository;
import com.HelpDesk.HelpDesk.model.Persona;
import java.util.Optional;
public interface PersonaRepository extends CrudRepository<Persona, Long>{
	
	public Optional<Persona> findByCedula(String cedula);
	public Optional<Persona> findByCelular(String celular);
	public Optional<Persona> findByApellido(String apellidod);
	public Optional<Persona> findByNombre (String nombre);
	public Optional<Persona> findByDireccion (String direccion);
	public Optional<Persona> findByTelefono (String telefono);
	public Optional<Persona> findByCorreoPersonal (String correoPersonal);
	public Optional<Persona> findByCorreoEspe (String correoEspe);
	public Optional<Persona> findById (long id);

}
