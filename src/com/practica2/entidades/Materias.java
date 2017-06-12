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
@Table(name = "materias")
public class Materias implements BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaterias;
    @Column(name="nombreMateria")
    private String nombreMateria;
    @Column(name="creditos")
    private int creditos;

    /**
     * @return the idMaterias
     */
    public int getIdMaterias() {
        return idMaterias;
    }

    /**
     * @param idMaterias the idMaterias to set
     */
    public void setIdMaterias(int idMaterias) {
        this.idMaterias = idMaterias;
    }

    /**
     * @return the nombreMateria
     */
    public String getNombreMateria() {
        return nombreMateria;
    }

    /**
     * @param nombreMateria the nombreMateria to set
     */
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdMaterias() + " ]";
    }
}
