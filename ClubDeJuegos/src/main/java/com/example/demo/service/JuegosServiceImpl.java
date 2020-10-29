package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Juegos;
import com.example.demo.repository.JuegosRepository;

@Service
public class JuegosServiceImpl implements IJuegosService{

	@Autowired
	private JuegosRepository juegosRepository;
	
	@Override
	public List<Juegos> listarTodos(){
		return (List<Juegos>) juegosRepository.findAll();
		
		
		
	}
	
	
}
