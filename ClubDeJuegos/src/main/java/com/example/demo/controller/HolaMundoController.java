package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Juegos;
import com.example.demo.service.IJuegosService;
@Controller
public class HolaMundoController {
	
	@Autowired
	private IJuegosService juegosService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("variable", "Club De Juegos");
		return "vistas/Bienvenida";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("variable", "Club De Juegos");
		return "vistas/Login";
	}
	@RequestMapping(value="/registro", method=RequestMethod.GET)
	public String registro(Model model) {
		
		model.addAttribute("variable", "Club De Juegos");
		return "vistas/Registro";
	}
	@RequestMapping(value="/coordinador", method=RequestMethod.GET)
	public String coordinador(Model model) {
		
		model.addAttribute("variable", "Club De Juegos");
		return "vistas/PanelCoordinador";
	}
	
	@RequestMapping(value="/usuario", method=RequestMethod.GET)
	public String usuario(Model model) {
		
		model.addAttribute("variable", "Club De Juegos");
		return "vistas/PanelUsuario";
	}
	@GetMapping("/responsable")
	public String responsable(Model model) {
		
		List<Juegos> listadoJuegos = juegosService.listarTodos();
		model.addAttribute("titulo", "Listado de Juegos");
		model.addAttribute("juegos", listadoJuegos);
		return "vistas/PanelResponsable";
	}
	
	
}
