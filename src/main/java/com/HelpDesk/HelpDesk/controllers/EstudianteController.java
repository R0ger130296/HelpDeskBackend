package com.HelpDesk.HelpDesk.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HelpDesk.HelpDesk.dao.EstudianteRepository;
import com.HelpDesk.HelpDesk.model.Estudiante;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
@RestController
public class EstudianteController {

	
		@Autowired
		private EstudianteRepository estudianteRepository;

		private ObjectMapper mapper;
		
	/* metodo editar y guardar*/ 

		@SuppressWarnings("rawtypes")
		@RequestMapping(value = "/saveOrUpdateEstudiante", method = RequestMethod.POST)
		public ResponseEntity saveOrUpdateEstudiante(@RequestBody String estudianteJson)
				throws JsonParseException, JsonMappingException, IOException {
			
	         Estudiante estudiante = new Estudiante();
			
	         this.mapper = new ObjectMapper();
			try {
				estudiante = this.mapper.readValue(estudianteJson, Estudiante.class);
				System.out.println(estudiante);
				
				if (!this.validate(estudiante)) {
					System.out.println("if");
					return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
				}
				this.estudianteRepository.save(estudiante);
				System.out.println("save");
				return new ResponseEntity(HttpStatus.OK);

			} catch (Exception e) {
				System.out.println(e);				
				return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}

		@RequestMapping(value = "/getEstudiante", method = RequestMethod.GET)

		/*metodo buscar*/
		
		public List<Estudiante> getEstudiante() {
			
			return (List<Estudiante>) this.estudianteRepository.findAll();
		}
		
		@RequestMapping(value="/deleteEstudiante", method = RequestMethod.POST)
		public void deleteUser(@RequestBody String estudianteJson) 
		throws Exception 
		 {
		this.mapper = new ObjectMapper();
		  Estudiante estudiante = this.mapper.readValue(estudianteJson, Estudiante.class);
		   if (estudiante.getId()== 0L) {
			   throw new Exception ("El Id esta nulo");
		   }
		this.estudianteRepository.delete(estudiante);
		}
		 
		private boolean validate(Estudiante estudiante) {
			boolean isValid = true;

			return isValid;
		}
}