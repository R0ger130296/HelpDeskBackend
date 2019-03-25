package com.HelpDesk.HelpDesk.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HelpDesk.HelpDesk.dao.PersonaRepository;
import com.HelpDesk.HelpDesk.model.Persona;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PersonaController {

	@Autowired
	protected PersonaRepository personaRepository;

	private ObjectMapper mapper;

	/*metodo buscar todas las personas*/
	@RequestMapping(value = "/getPersonas", method = RequestMethod.GET)
	public List<Persona> getPersona() {
		return (List<Persona>) this.personaRepository.findAll();
	}
	
	/*metodo buscar por cedula*/
	@RequestMapping(value = "/Cedula/{cedula}", method = RequestMethod.GET)
	public Optional <Persona> cedula(String cedula) {
		return (Optional<Persona>) this.personaRepository.findByCedula(cedula);
	}
	/*metodo buscar por celular*/
	@RequestMapping(value = "/Celular/{celular}", method = RequestMethod.GET)
	public Optional <Persona> celular(String celular) {
		return (Optional<Persona>) this.personaRepository.findByCelular(celular);
	}
	/*metodo buscar por apellido*/
	@RequestMapping(value = "/Apellido/{apellido}", method = RequestMethod.GET)
	public Optional <Persona> apellido(String apellido) {
		return (Optional<Persona>) this.personaRepository.findByApellido(apellido);
	}
	
	/*metodo buscar por nombre*/
	@RequestMapping(value = "/Nombre/{nombre}", method = RequestMethod.GET)
	public Optional <Persona> nombre(String nombre) {
		return (Optional<Persona>) this.personaRepository.findByNombre(nombre);
	}
	
	/*metodo buscar por direccion*/
	@RequestMapping(value = "/Direccion/{direccion}", method = RequestMethod.GET)
	public Optional <Persona> direccion(String direccion) {
		return (Optional<Persona>) this.personaRepository.findByDireccion(direccion);
	}
	
	/*metodo buscar por telefono*/
	@RequestMapping(value = "/Telefono/{telefono}", method = RequestMethod.GET)
	public Optional <Persona> telefono(String telefono) {
		return (Optional<Persona>) this.personaRepository.findByTelefono(telefono);
	}
	
	/*metodo buscar por CorreoPersonal*/
	@RequestMapping(value = "/CorreoPersonal/{correoPersonal}", method = RequestMethod.GET)
	public Optional <Persona> correopersonal(String correoPersonal) {
		return (Optional<Persona>) this.personaRepository.findByCorreoPersonal(correoPersonal);
	}
	
	/*metodo buscar por CorreoEspe*/
	@RequestMapping(value = "/CorreoEspe/{correoEspe}", method = RequestMethod.GET)
	public Optional <Persona> correoespe(String correoEspe) {
		return (Optional<Persona>) this.personaRepository.findByCorreoEspe(correoEspe);
	}
	
	/*metodo buscar por Id*/
	@RequestMapping(value = "/Id/{id}", method = RequestMethod.GET)
	public Optional <Persona> Id(long id) {
		return (Optional<Persona>) this.personaRepository.findById(id);
	}
	
	@RequestMapping(value="/deletePersonas", method = RequestMethod.POST)
	public void deletePersona(@RequestBody String personaJson) 
	throws Exception 
	 {
	this.mapper = new ObjectMapper();
	  Persona persona = this.mapper.readValue(personaJson, Persona.class);
	   if (persona.getId()== 0L) {
		   throw new Exception ("El Id esta nulo");
	   }
	this.personaRepository.delete(persona);
	}
	@SuppressWarnings("unused")
	private boolean validate(Persona persona) {
		boolean isValid = true;
		return isValid;
	}
}