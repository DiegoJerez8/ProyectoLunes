package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.modelo.Curso;


public interface CursoDao extends JpaRepository<Curso, Integer> {

	@Query("select c From Curso c where c.precio between :precioMin and :precioMax")
	public List<Curso> RangoCursos(int precioMin, int precioMax);

}
