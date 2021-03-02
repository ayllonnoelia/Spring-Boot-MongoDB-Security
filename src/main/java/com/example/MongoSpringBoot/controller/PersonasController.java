package com.example.MongoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MongoSpringBoot.model.Personas_Matriculadas;
import com.example.MongoSpringBoot.repository.PersonasRepository;

@RestController
public class PersonasController {

	@Autowired
	private PersonasRepository repo;
	
	/*@PostMapping("/insertarPersona")
	public Personas_Matriculadas insertarPersona(@RequestBody Personas_Matriculadas persona) {
		//Personas_Matriculadas.setId(SequenceGeneratorService.generateSequence(Personas_Matriculadas.SEQUENCE_NAME));
		return repo.save(persona);
	}
	
	@PostMapping("/insertarPersonas")
	public List<Personas_Matriculadas> insertarPersonas(@RequestBody List<Personas_Matriculadas> personas){
		return repo.saveAll(personas);
	}

	@GetMapping("/personas")
	public List<Personas_Matriculadas> verTodos() {
		return repo.findAll();
	}

	@GetMapping("/personasPorId/{id}")
	public Personas_Matriculadas personaPorId(@PathVariable int id) {
		return repo.findById(id).orElse(null);
	}
	
	@GetMapping("/personasPorNombre/{nombre}")
	public List<Personas_Matriculadas> personaPorNombre(@PathVariable String nombre){
		return repo.findByNombre(nombre);
	}
	
	@GetMapping("/personasPorFormacion/{formacion}")
	public List<Personas_Matriculadas> personaPorFormacion(@PathVariable String formacion){
		return repo.findByFormacion(formacion);
	}
	
	@GetMapping("/personasPorCiudad/{ciudad}")
	public List<Personas_Matriculadas> personaPorCiudad(@PathVariable String ciudad){
		return repo.findByCiudad(ciudad);
	}
	
	@DeleteMapping("eliminarPersona/{id}")
	public String eliminarPersona(@PathVariable int id) {
		repo.deleteById(id);
		return "El registro existente ha sido eliminado correctamente";
	}
	
	@DeleteMapping("/eliminarTodos")
	public String eliminarTodos() {
		repo.deleteAll();
		return "Todos los registros existentes en la coleccion han sido eliminados";
	}
	
	@PutMapping("/modificar/{id}")	
	public Personas_Matriculadas modificarPersona(@RequestBody Personas_Matriculadas persona, @PathVariable int id) {
		return repo.save(persona);
	}*/
	
	
}
