package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipodejuego")
public class Juegos {

	@Id
	private Long Id_tipodejuego;
	
	private String Nombre;
	
	private String Tipodejuego;
	
	private String Descripcion;

	public Long getId_tipodejuego() {
		return Id_tipodejuego;
	}

	public void setId_tipoDeJuego(Long Id_tipodejuego) {
		this.Id_tipodejuego = Id_tipodejuego;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipodejuego() {
		return Tipodejuego;
	}

	public void setTipodejuego(String Tipodejuego) {
		Tipodejuego = Tipodejuego;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Juegos [Id_tipodejuego=" + Id_tipodejuego + ", Nombre=" + Nombre + ", Tipodejuego=" + Tipodejuego
				+ ", Descripcion=" + Descripcion + "]";
	}

	
	
	
	
}
