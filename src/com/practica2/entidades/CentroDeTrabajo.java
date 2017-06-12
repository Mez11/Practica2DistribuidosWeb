package com.practica2.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.delta.hb.BasicEntity;

/**
 *
 * @author
 */
@Entity
@Table(name = "centrodetrabajo")
public class CentroDeTrabajo implements BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentroDeTrabajo;
    @Column(name="nombreCentroDeTrabajo")
    private String nombreCentroDeTrabajo;

    /**
     * @return the idCentroDeTrabajo
     */
    public int getIdCentroDeTrabajo() {
        return idCentroDeTrabajo;
    }

    /**
     * @param idCentroDeTrabajo the idCentroDeTrabajo to set
     */
    public void setIdCentroDeTrabajo(int idCentroDeTrabajo) {
        this.idCentroDeTrabajo = idCentroDeTrabajo;
    }

    /**
     * @return the nombreCentroDeTrabajo
     */
    public String getNombreCentroDeTrabajo() {
        return nombreCentroDeTrabajo;
    }

    /**
     * @param nombreCentroDeTrabajo the nombreCentroDeTrabajo to set
     */
    public void setNombreCentroDeTrabajo(String nombreCentroDeTrabajo) {
        this.nombreCentroDeTrabajo = nombreCentroDeTrabajo;
    }

    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdCentroDeTrabajo() + " ]";
    }
}
