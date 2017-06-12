package com.practica2.entidades;

import java.io.Serializable;

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
@Table(name = "preguntas")
public class Preguntas implements BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    @Column(name="pregunta")
    private String pregunta;
    @ManyToOne
    @JoinColumn(name="idExamen")
    Examen examen;
    

    public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	/**
     * @return the idPregunta
     */
    public int getIdPregunta() {
        return idPregunta;
    }

    /**
     * @param idPregunta the idPregunta to set
     */
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdPregunta() + " ]";
    }
}
