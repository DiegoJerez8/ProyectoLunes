package com.example.servicio;

import java.util.List;
import java.util.Optional;

import com.example.modelo.Curso;

public interface CursoServicio {

	/**
	 * acciones que quiero que realice , la implementacion se realizará en
	 * EjemplatServiceImpl.java
	 * 
	 * @return
	 */

	// ayudas
	List<Curso> listarCursos();

	Optional<Curso> buscarCurso(int codigo);

	// Ejercicio
	List<Curso> altaCurso(Curso curso);

	void eliminarCurso(int codigo);

	void actualizarCurso(int codigo, int duracion);

	List<Curso> buscarCursoPrecio(int precioMin, int precioMax);

}
