package com.practica2.entidades;

import java.io.Serializable;

public class Datos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  int alumnosTotales;
	private String carrera;
	
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getAlumnosTotales() {
		return alumnosTotales;
	}
	public void setAlumnosTotales(int alumnosTotales) {
		this.alumnosTotales = alumnosTotales;
	}
	
	
}
