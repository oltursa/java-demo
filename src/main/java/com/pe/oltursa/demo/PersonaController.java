package com.pe.oltursa.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pe.oltursa.demo.domain.Persona;
import com.pe.oltursa.demo.service.PersonaService;

@Controller
public class PersonaController {
	private PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		this.personaService = personaService;
	}

	@GetMapping("/")
	public String inicio(Model model) {
		List<Persona> lista=personaService.listar();
		model.addAttribute("personas", lista);
		return "inicio";
	}
	@PostMapping("/save")
	public String saveBooks(@ModelAttribute Persona persona, Model model) {
		personaService.guardar(persona);
		List<Persona> lista=personaService.listar();
		model.addAttribute("personas", lista);
	    return "redirect:/";
	}
}
