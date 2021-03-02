package com.example.MongoSpringBoot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.MongoSpringBoot.model.Personas_Matriculadas;
import com.example.MongoSpringBoot.repository.PersonasRepository;

@Controller
public class PersonasControllerThymeleaf {

	
	@Autowired
	private PersonasRepository repo;
	
	
	/*
	 * *************************PÁGINA DE MENÚ PRINCIPAL****************************
	 * */
	
	@GetMapping("/")
    public String indexMostrar(Model model) {
        return "index";
    }
	
	
	/*
	 * *************************PÁGINAS CON MENSAJES CORRECTOS****************************
	 * */
	
	//PAGINA INSERCION CORRECTA
	@GetMapping("/insercionCorrecta")
    public String inserCorrect(Model model) {
        return "correcto";
    }
	
	//PAGINA ELIMINACION CORRECTA
	@GetMapping("/eliminacionCorrecta")
    public String elimCorrect(Model model) {
        return "eliminado";
    }
	
	//PAGINA ELIMINACION CORRECTA
	@GetMapping("/eliminacionTotalCorrecta")
    public String elimTotCorrect(Model model) {
        return "eliminadoss";
    }
	
	//PAGINA MODIFICACION CORRECTA
	@GetMapping("/modificacionCorrecta")
    public String modCorrect(Model model) {
        return "modificado";
    }
	
	/*
	 * *************************OPERACIONES CRUD HTML****************************
	 * */
	
	
	//VER TODOS LOS REGISTROS
	@GetMapping("/personas")
    public String verPersonas(Model model) {
        model.addAttribute("personas", repo.findAll());
        return "listado";
    }
	
	//VER ALUMNOS
	@GetMapping("/alumnos")
    public String verAlumnos(Model model) {
        model.addAttribute("personas", repo.findAll());
        return "alumnos";
    }
	
	//VER PROFESORES
	@GetMapping("/profesores")
    public String verProfesores(Model model) {
        model.addAttribute("personas", repo.findAll());
        return "profesores";
    }
	
	//VER CURSOS
	@GetMapping("/cursos")
    public String verCursos(Model model) {
        model.addAttribute("personas", repo.findAll());
        return "cursos";
    }
	
	//PANTALLA DE INSERCION DE REGISTRO HTML
	@GetMapping("/insertar")
	public String formInsertUnico(Model model) {
		model.addAttribute("personas",new Personas_Matriculadas());
		return "insertarPersona";
	}	

	//INSERTAR REGISTRO Y MANDAR A PANTALLA DE COMPROBACION HTML
	@PostMapping("/insertarPersona")
	public String insertarProducto(Personas_Matriculadas persona) {
		//Personas_Matriculadas.setId(SequenceGeneratorService.generateSequence(Personas_Matriculadas.SEQUENCE_NAME));
		repo.save(persona);
		return "redirect:/insercionCorrecta";
	}

	//BORRAR REGISTRO Y MANDAR A PANTALLA DE COMPROBACION HTML
	@GetMapping("/eliminarPersona/{id}")
	public String formEliminar(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/eliminacionCorrecta";
	}
	
	//BORRAR TODOS LOS REGISTROS Y MANDAR A PANTALLA DE COMPROBACION HTML
	@GetMapping("/eliminarTodos")
	public String formEliminarTodos() {
		repo.deleteAll();
		return "redirect:/eliminacionTotalCorrecta";
	}
	
	//PANTALLA DE MODIFICACION DE REGISTRO HTML
	@GetMapping("/modificar/{id}")	
	public String formModificarRegistro(@PathVariable("id") Integer id, Model model) {
		Personas_Matriculadas personas = repo.findById(id).get();
		model.addAttribute("persona", personas);
		return "modificarPersona";
	}
	
	//MODIFICAR REGISTRO Y MANDAR A PANTALLA DE COMPROBACION HTML
	@PostMapping("/modificarPersona")
	public String modProducto(Personas_Matriculadas persona) {
		repo.save(persona);
		return "redirect:/modificacionCorrecta";
	}
	
	
	
}
