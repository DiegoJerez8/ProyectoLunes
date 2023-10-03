package com.example.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.Curso;
import com.example.servicio.CursoServicio;

@RestController
public class CursosControlador {

	@Autowired
	CursoServicio servicio;

	@GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> listaCursos() {

		return servicio.listarCursos();

	}

	@GetMapping(value = "curso/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursoPrecio(@PathVariable("precioMin") int precioMin, @PathVariable("precioMax") int precioMax) {
		return servicio.buscarCursoPrecio(precioMin, precioMax);

	}

	/**
	 * 
	 * @param codigo
	 * @return Optional<curso>
	 */
	@GetMapping(value = "curso/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Curso> getItemById(@PathVariable("codigo") int codigo) {
		return servicio.buscarCurso(codigo);
	}

	/**
	 * 
	 * @param curso
	 */
	@PostMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaCurso(@RequestBody Curso curso) {
		servicio.altaCurso(curso);
	}

	/**
	 * 
	 * @param codigo
	 * @return List<Curso>
	 */
	@DeleteMapping(value = "curso/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarCurso(@PathVariable("codigo") int codigo) {
		servicio.eliminarCurso(codigo);
	}

	/**
	 * 
	 * @param Curso
	 */
	@PutMapping(value = "curso/{codigo}/{duracion}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarCurso(@PathVariable("codigo") int codigo, @PathVariable("duracion") int duracion) {
		servicio.actualizarCurso(codigo, duracion);
	}

	
}
