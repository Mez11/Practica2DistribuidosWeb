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
@Table(name = "respuestas")
public class Respuestas implements BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuestas;
    @Column(name="Respuestas")
    private String Respuesta;
    @ManyToOne
    @JoinColumn(name="idPregunta")
    private int idPregunta;
    Preguntas preguntas;
    
   

	public Preguntas getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Preguntas preguntas) {
		this.preguntas = preguntas;
	}

	/**
     * @return the idRespuestas
     */
    public int getIdRespuestas() {
        return idRespuestas;
    }

    /**
     * @param idRespuestas the idRespuestas to set
     */
    public void setIdRespuestas(int idRespuestas) {
        this.idRespuestas = idRespuestas;
    }

    /**
     * @return the Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     * @param Respuesta the Respuesta to set
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getIdRespuestas() + " ]";
    }
}
