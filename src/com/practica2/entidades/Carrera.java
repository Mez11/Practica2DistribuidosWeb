package com.practica2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.delta.hb.BasicEntity;

/**
 *
 * @author 
 */
@Entity
@Table(name = "carrera")
public class Carrera implements BasicEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 938268995702340052L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarrera;
	
	@Column(name="nombreCarrera")
    private String nombreCarrera;
	
	@Column(name="duracion")
    private int duracion;
	@ManyToOne
	@JoinColumn(name="idCentroDeTrabajo")
	
    CentroDeTrabajo centro;
    
	
	public CentroDeTrabajo getCentro() {
		return centro;
	}

	public void setCentro(CentroDeTrabajo centro) {
		this.centro = centro;
	}

	/**
     * @return the idCarrera
     */
    public int getIdCarrera() {
        return idCarrera;
    }

    /**
     * @param idCarrera the idCarrera to set
     */
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * @return the nombreCarrera
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    /**
     * @param nombreCarrera the nombreCarrera to set
     */
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdCarrera() + " ]";
    }
}
