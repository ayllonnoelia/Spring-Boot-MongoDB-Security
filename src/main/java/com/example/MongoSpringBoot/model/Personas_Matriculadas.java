package com.example.MongoSpringBoot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection="personas_matriculadas")
public class Personas_Matriculadas {
	
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	private int id;
	private String nombre;
	private String apellidos_matriculado;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_nacimiento_matriculado;
	
	private Profesores profesores;
	
	private Cursos cursos;

	public Personas_Matriculadas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personas_Matriculadas(int id, String nombre, String apellidos_matriculado, Date fecha_nacimiento_matriculado,
			Profesores profesores, Cursos cursos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos_matriculado = apellidos_matriculado;
		this.fecha_nacimiento_matriculado = fecha_nacimiento_matriculado;
		this.profesores = profesores;
		this.cursos = cursos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos_matriculado() {
		return apellidos_matriculado;
	}

	public void setApellidos_matriculado(String apellidos_matriculado) {
		this.apellidos_matriculado = apellidos_matriculado;
	}

	public Date getFecha_nacimiento_matriculado() {
		return fecha_nacimiento_matriculado;
	}

	public void setFecha_nacimiento_matriculado(Date fecha_nacimiento_matriculado) {
		this.fecha_nacimiento_matriculado = fecha_nacimiento_matriculado;
	}

	public Profesores getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesores profesores) {
		this.profesores = profesores;
	}

	public Cursos getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Personas_Matriculadas [id=" + id + ", nombre=" + nombre + ", apellidos_matriculado="
				+ apellidos_matriculado + ", fecha_nacimiento_matriculado=" + fecha_nacimiento_matriculado
				+ ", profesores=" + profesores + ", cursos=" + cursos + "]";
	}
	
}
