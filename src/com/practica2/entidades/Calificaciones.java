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
@Table(name = "calificaciones")
public class Calificaciones implements BasicEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4277002621635296334L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//Cambiar idCalificaciones int
    private long idCalificaciones;
	@Column(name="puntaje")
    private double puntaje;
	//Examen foranea
	 @ManyToOne
	 @JoinColumn(name="idExamen")
	 private Examen examen;

    public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	/**
     * @return the idCalificaciones
     */
   @Column(name="matricula")
    public long getMatricula() {
        return idCalificaciones;
    }

    /**
     * @param idCalificaciones the idCalificaciones to set
     */
    public void setMatricula(long idCalificaciones) {
        this.idCalificaciones = idCalificaciones;
    }

    /**
     * @return the puntaje
     */
    public double getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
    @Override
    public String toString() {
        return "com.practica2.entidades.Carrera[ id=" + getMatricula() + " ]";
    }
    
}
