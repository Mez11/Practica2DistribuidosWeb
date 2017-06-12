package com.practica2.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.practica2.dao.AlumnoDao;
import com.practica2.dao.CalificacionesDao;
import com.practica2.dao.CarreraDao;
import com.practica2.dao.CentroDeTrabajoDao;
import com.practica2.dao.ExamenDao;
import com.practica2.dao.MateriasDao;
import com.practica2.dao.PreguntasDao;
import com.practica2.dao.RespuestasDao;
import com.practica2.entidades.Alumno;
import com.practica2.entidades.Calificaciones;
import com.practica2.entidades.Carrera;
import com.practica2.entidades.CentroDeTrabajo;
import com.practica2.entidades.Examen;
import com.practica2.entidades.Materias;
import com.practica2.entidades.Preguntas;
import com.practica2.entidades.Respuestas;

public class Prueba {
	private static final Logger logger = LoggerFactory.getLogger( Prueba.class );
	public static void main(String[] args) {
		//logger.debug("Llamando alumno");
		//Alumno alumno = new Alumno();
		logger.debug("Llamar calificaciones");
		CalificacionesDao  daoC = new CalificacionesDao();
		logger.debug("LLamando carrera");
		CarreraDao  daoCa = new CarreraDao();
		logger.debug("LLamando a Centro de trabajo");
		CentroDeTrabajoDao daoCen = new CentroDeTrabajoDao();
		logger.debug("Llamando examen");
		ExamenDao daoE = new ExamenDao();
		logger.debug("LLamando a materia");
		MateriasDao daoM = new MateriasDao();
		logger.debug("LLamando a preguntas");
		PreguntasDao daoP = new PreguntasDao();
		logger.debug("Llamando respuestas");
		RespuestasDao daoR = new RespuestasDao();
		//Pruebas ya pasadas
		logger.debug( "Calling dao alumno" );
		AlumnoDao dao = new AlumnoDao( );
		//Pruebas de dao
		logger.debug( "Calling dao calificaciones" );
		CalificacionesDao dao1 = new CalificacionesDao();
		logger.debug("Calling dao carrera");
		CarreraDao dao2 = new CarreraDao();
		logger.debug("Calling dao centro de trabajo");
		CentroDeTrabajoDao dao3 =new CentroDeTrabajoDao();
		logger.debug("Calling dao examen");
		ExamenDao dao4 = new ExamenDao();
		logger.debug("Calling dao materias");
		MateriasDao dao5 = new MateriasDao();
		logger.debug("Calling dao preguntas");
		PreguntasDao dao6 = new PreguntasDao();
		logger.debug("Calling dao respuestas");
		RespuestasDao dao7 = new RespuestasDao();
		//Select all
		logger.debug( "SELECT * FROM" );
		List<Alumno> alumnos = dao.findAll( );
		for( Alumno alumno : alumnos ){
			logger.debug( "Alumno: {}", alumno.toString() );
		}
		//Select all Calificaciones
		logger.debug("Selec * from Calificaciones");
		List<Calificaciones> calificaciones = daoC.findAll();
		for(Calificaciones calificaciones2 : calificaciones){
			logger.debug("Calificaciones:{}",calificaciones2.toString());
		}
		//Select all Carrera 
		logger.debug("Select *from Carrera");
		List<Carrera> carrera = daoCa.findAll();
		for(Carrera carrera2 : carrera){
			logger.debug("Carrera:{}",carrera2.toString());
		}
		//Select all Centro de trabajo
		logger.debug("Select * from Centro de trabajo");
		List<CentroDeTrabajo> centroDeTrabajos = daoCen.findAll();
		for(CentroDeTrabajo centroDeTrabajo2 : centroDeTrabajos){
			logger.debug("Centro de trabajo:{}",centroDeTrabajo2.toString());
		}
		//Select all examen
		logger.debug("Selec * from Examen");
		List<Examen> examens = dao4.findAll();
		for(Examen examen : examens){
			logger.debug("Examen:{}",examen.toString());
		}
		//Select all materias
		logger.debug("Select * from Materias");
		List<Materias> materias = dao5.findAll();
		for(Materias materias1 : materias){
			logger.debug("Materias:{}",materias.toString());
		}
		//Select all preguntas
		logger.debug("Select * from Preguntas");
		List<Preguntas> preguntas = dao6.findAll();
		for(Preguntas preguntas2 : preguntas){
			logger.debug("Preguntas:{}",preguntas.toString());
		}
		//Select all respuestas
		logger.debug("Select * from Respuestas");
		List<Respuestas> respuestas = dao7.findAll();
		for(Respuestas respuestas2 :respuestas){
			logger.debug("Respuestas:{}",respuestas.toString());
		}
		logger.debug( "END" );
		System.exit( 0 );
		
	} 
	
}
