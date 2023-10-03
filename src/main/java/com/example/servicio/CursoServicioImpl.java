package com.example.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.CursoDao;
import com.example.modelo.Curso;

@Service
public class CursoServicioImpl implements CursoServicio {

	@Autowired
	CursoDao dao;

	@Override
	public List<Curso> listarCursos() {
		return dao.findAll();
	}

	@Override
	public Optional<Curso> buscarCurso(int codigo) {
		return dao.findById(codigo);
	}

	@Override
	public List<Curso> altaCurso(Curso curso) {
		dao.save(curso);
		return dao.findAll();
	}

	@Override
	public void eliminarCurso(int codigo) {
		dao.deleteById(codigo);
	}

	@Override
	public void actualizarCurso(int codigo, int duracion) {
		Curso cursotemporal = dao.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("no se ha encontraod ningun curso con ese codigo"));
		cursotemporal.setDuracion(duracion);
		dao.save(cursotemporal);
	}

	@Override
	public List<Curso> buscarCursoPrecio(int precioMin, int precioMax) {

		return dao.RangoCursos(precioMin, precioMax);
	}

}
