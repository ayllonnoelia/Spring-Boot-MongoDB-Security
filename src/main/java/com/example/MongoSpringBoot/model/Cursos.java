package com.example.MongoSpringBoot.model;

public class Cursos {

	private String nombre_curso;
	private String ciudad;
	private String direccion;
	
	public Cursos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cursos(String nombre_curso, String ciudad, String direccion) {
		super();
		this.nombre_curso = nombre_curso;
		this.ciudad = ciudad;
		this.direccion = direccion;
	}
	
	public String getNombre_curso() {
		return nombre_curso;
	}
	
	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Cursos [nombre_curso=" + nombre_curso + ", ciudad=" + ciudad + ", direccion=" + direccion + "]";
	}
	
}
