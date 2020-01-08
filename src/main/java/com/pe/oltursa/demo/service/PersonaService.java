package com.pe.oltursa.demo.service;

import java.util.List;

import com.pe.oltursa.demo.domain.Persona;

public interface PersonaService {
	List<Persona> listar();


	void guardar(Persona persona);


	
}
