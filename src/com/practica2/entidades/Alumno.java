package com.practica2.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import com.delta.hb.BasicEntity;

/**
 *
 * @author 
 */

@Entity
@Table(name = "alumno")
public class Alumno implements BasicEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3580717819123860073L;
	private Carrera carrera;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="matricula")
    private long matricula;
	@Column(name ="nombreAlumno")
    private String nombreAlumno;
	@Column(name="paternoAlumno")
    private String paternoAlumno;
	@Column(name="maternoAlumno")
    private String maternoAlumno;
	@Column(name="fechaNacimiento")
    private Date fechaNacimiento;
	@Column(name="calle")
    private String calle;
	@Column(name="colonia")
    private String colonia;
	@Column(name="numero")
    private int numero;
	@Column(name="codigoPostal")
    private long codigoPostal;
	@Column(name="sexo")
    private char sexo;
	@Column(name="eMail")
    private String eMail;
    
    //Foranea de carrera
    @ManyToOne
    @JoinColumn(name="idCarrera")
    Carrera carre;
   
	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Carrera getCarre() {
		return carre;
	}

	public void setCarre(Carrera carre) {
		this.carre = carre;
	}

	/**
     * @return the matricula
     */
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nombreAlumno
     */
    @Column(name="nombreAlumno")
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * @param nombreAlumno the nombreAlumno to set
     */
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    /**
     * @return the paternoAlumno
     */
    @Column(name="paternoAlumno")
    public String getPaternoAlumno() {
        return paternoAlumno;
    }

    /**
     * @param paternoAlumno the paternoAlumno to set
     */
    public void setPaternoAlumno(String paternoAlumno) {
        this.paternoAlumno = paternoAlumno;
    }

    /**
     * @return the maternoAlumno
     */
    @Column(name="maternoAlumno")
    public String getMaternoAlumno() {
        return maternoAlumno;
    }

    /**
     * @param maternoAlumno the maternoAlumno to set
     */
    public void setMaternoAlumno(String maternoAlumno) {
        this.maternoAlumno = maternoAlumno;
    }

    /**
     * @return the fechaNacimiento
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="fechaNacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the calle
     */
    @Column(name="calle")
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    @Column(name="colonia")
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the numero
     */
    @Column(name="numero")
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the codigoPostal
     */
    @Column(name="codigoPostal")
    public long getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(long codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the sexo
     */
    @Column(name="sexo")
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the eMail
     */
    @Column(name="email")
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
 }
