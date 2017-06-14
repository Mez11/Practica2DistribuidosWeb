package com.practica2.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica2.dao.AlumnoDao;
import com.practica2.entidades.Alumno;



	

/**
 * Servlet implementation class ServletAlta
 */
@WebServlet("/ServletAlta")
public class ServletAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Alumno alumno = new Alumno();
		AlumnoDao dao = new AlumnoDao();
		
		Alumno alumno = fillData( request );
		//EventoDAO dao= new EventoDAO();
		Boolean s = Boolean.parseBoolean( request.getParameter("edit") );
		
		
		dao.getSessionFactory();
		
		if( s  ) {
			//modo "edicion"
			//ejecutar update
			
			dao.update( alumno );
		}
		//else{
			//modo "Alta"
			//Ejecutar create
			//dao.create(alumno);
		//}
		
		
		response.sendRedirect("ServletTabla");
	}
	
	
	private Alumno fillData( HttpServletRequest request ){
	    Alumno alumno = new Alumno();
		
		String nombreAlumno = request.getParameter("nombreAlumno");
		String paternoAlumno= request.getParameter("paternoAlumno");
		String maternoAlumno = request.getParameter("maternoAlumno");
		String calle = request.getParameter("calle");
		String colonia = request.getParameter("colonia");
		String sexo = request.getParameter("sexo");
		String eMail = request.getParameter("eMail");
		String matricula =request.getParameter("matricula");
	
		
		//Se puso en calse entidad Tabla 
		//Integer se = Integer.parseInt(duracion);
		//if(id !=null){
			//Integer s = Integer.parseInt(id);
				//evento.setId(s);
		//}
		
		//SimpleDateFormat sd = new SimpleDateFormat("dd,mm,yyyy");
		//Date sDate;
		//try {
			//sDate = new Date( sd.parse(fechaNacimiento).getTime() );
		//} catch (ParseException e) {
			//e.printStackTrace();
			//return null;
		//}
		
		alumno.setNombreAlumno(nombreAlumno);
		alumno.setPaternoAlumno(paternoAlumno);
		alumno.setMaternoAlumno(maternoAlumno);
		alumno.setCalle(calle);
		alumno.setColonia(colonia);
		//alumno.setSexo(sexo);
		alumno.seteMail(eMail);
	
		
		
		
		return alumno;
		
	}
	//ACTUALIZAR..@.@.
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}//end class

	
	

