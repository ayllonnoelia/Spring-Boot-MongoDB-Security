package com.example.MongoSpringBoot.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Profesores {

	private String nombre_profesor;
	private String apellidos_profesor;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_nacimiento_profesor;
	private String formacion;
	
	public Profesores() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Profesores(String nombre_profesor, String apellidos_profesor, Date fecha_nacimiento_profesor,
			String formacion) {
		super();
		this.nombre_profesor = nombre_profesor;
		this.apellidos_profesor = apellidos_profesor;
		this.fecha_nacimiento_profesor = fecha_nacimiento_profesor;
		this.formacion = formacion;
	}
	
	public String getNombre_profesor() {
		return nombre_profesor;
	}
	
	public void setNombre_profesor(String nombre_profesor) {
		this.nombre_profesor = nombre_profesor;
	}
	
	public String getApellidos_profesor() {
		return apellidos_profesor;
	}
	
	public void setApellidos_profesor(String apellidos_profesor) {
		this.apellidos_profesor = apellidos_profesor;
	}
	
	public Date getFecha_nacimiento_profesor() {
		return fecha_nacimiento_profesor;
	}
	
	public void setFecha_nacimiento_profesor(Date fecha_nacimiento_profesor) {
		this.fecha_nacimiento_profesor = fecha_nacimiento_profesor;
	}
	
	public String getFormacion() {
		return formacion;
	}
	
	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}
	
	@Override
	public String toString() {
		return "Profesores [nombre_profesor=" + nombre_profesor + ", apellidos_profesor=" + apellidos_profesor
				+ ", fecha_nacimiento_profesor=" + fecha_nacimiento_profesor + ", formacion=" + formacion + "]";
	}

}
