package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Juegos;

@Repository
public interface JuegosRepository extends CrudRepository<Juegos, Long>{

}
