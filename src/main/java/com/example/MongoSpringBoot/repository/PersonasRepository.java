package com.example.MongoSpringBoot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.MongoSpringBoot.model.Personas_Matriculadas;

public interface PersonasRepository extends MongoRepository<Personas_Matriculadas, Integer>{

	List<Personas_Matriculadas> findByNombre(String nombre);

	@Query("{'Profesores.formacion':?0}")
	List<Personas_Matriculadas> findByFormacion(String formacion);

	@Query("{'Cursos.ciudad':?0}")
	List<Personas_Matriculadas> findByCiudad(String ciudad);

}


