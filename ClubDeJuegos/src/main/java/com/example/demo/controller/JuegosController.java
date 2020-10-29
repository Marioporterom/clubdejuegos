package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Juegos;
import com.example.demo.service.IJuegosService;

public class JuegosController {

	@Autowired
	private IJuegosService juegosService;
	
	@GetMapping("/responsable")
	public String responsable(Model model) {
		
		List<Juegos> listadoJuegos = juegosService.listarTodos();
		model.addAttribute("titulo", "Listado de Juegos");
		model.addAttribute("juegos", listadoJuegos);
		return "/vistas/PanelResponsable";
	}
	
	
}
