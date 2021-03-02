package com.example.MongoSpringBoot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.MongoSpringBoot.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>{

	Usuario findByNombre(String nombre);
	
}


