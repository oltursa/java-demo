package com.pe.oltursa.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pe.oltursa.demo.domain.Persona;
import com.pe.oltursa.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
	private PersonaRepository personaRepository;

	public PersonaServiceImpl(PersonaRepository personaRepository) {
		
		this.personaRepository = personaRepository;
	}

	@Override
	public List<Persona> listar() {

		return personaRepository.listar();
	}

	@Override
	public void guardar(Persona persona) {
		personaRepository.guardar(persona);
	}
	
	
}
