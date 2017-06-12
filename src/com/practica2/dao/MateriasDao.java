package com.practica2.dao;

import com.delta.hb.AbstractDAO;

import com.practica2.entidades.Materias;

public class MateriasDao extends AbstractDAO<Materias> {
	public MateriasDao(){
		super(Materias.class);
	}
}
