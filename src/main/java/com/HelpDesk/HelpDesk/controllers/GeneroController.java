package com.HelpDesk.HelpDesk.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HelpDesk.HelpDesk.dao.GeneroRepository;
import com.HelpDesk.HelpDesk.model.Genero;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
@RestController
public class GeneroController {

	
		@Autowired
		private GeneroRepository generoRepository;

		private ObjectMapper mapper;
		
	/* metodo editar y guardar*/ 

		@SuppressWarnings("rawtypes")
		@RequestMapping(value = "/saveOrUpdateGenero", method = RequestMethod.POST)
		public ResponseEntity saveOrUpdateGenero(@RequestBody String generoJson)
				throws JsonParseException, JsonMappingException, IOException {
			
	         Genero genero = new Genero();
			
	         this.mapper = new ObjectMapper();
			try {
				genero = this.mapper.readValue(generoJson, Genero.class);
				System.out.println(genero);
				
				if (!this.validate(genero)) {
					System.out.println("if");
					return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
				}
				this.generoRepository.save(genero);
				System.out.println("save");
				return new ResponseEntity(HttpStatus.OK);

			} catch (Exception e) {
				System.out.println(e);				
				return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}

		@RequestMapping(value = "/getGenero", method = RequestMethod.GET)

		/*metodo buscar*/
		
		public List<Genero> getGenero() {
			
			return (List<Genero>) this.generoRepository.findAll();
		}
		
		@RequestMapping(value="/deleteGenero", method = RequestMethod.POST)
		public void deleteUser(@RequestBody String generoJson) 
		throws Exception 
		 {
		this.mapper = new ObjectMapper();
		  Genero genero = this.mapper.readValue(generoJson, Genero.class);
		   if (genero.getId()== 0L) {
			   throw new Exception ("El Id esta nulo");
		   }
		this.generoRepository.delete(genero);
		}
		 
		private boolean validate(Genero genero) {
			boolean isValid = true;

			return isValid;
		}
}