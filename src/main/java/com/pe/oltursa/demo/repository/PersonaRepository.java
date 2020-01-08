package com.pe.oltursa.demo.repository;

import java.util.List;

import com.pe.oltursa.demo.domain.Persona;

public interface PersonaRepository {

	List<Persona> listar();

	void guardar(Persona persona);

}
