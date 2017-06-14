package com.practica2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica2.dao.AlumnoDao;

public class ServletTabla extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletTabla() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Posible Codigo
		
		AlumnoDao  dao =new AlumnoDao();
		List<AlumnoDao> alumnos;
		dao.getSessionFactory();
		alumnos=(List<AlumnoDao>) dao.getSessionFactory();
		//eventos=dao.getEventos();
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href ='FormularioTabla?edit=false'>");
		out.println("<button value='Alta'>Alta @.@</button>");
		out.println("</a>");
		out.println("<table border='1'>");
		
		
		out.println("<tr>");
		out.println("<td>");
		out.println("id");
		out.println("</td>");
		
		out.println("<td>");
		out.println("NombreAlumno");
		
		out.println("</td>");
		
		out.println("<td>");
		out.println("Apellido materno");
		
		out.println("</td>");
		
		out.println("<td>");
		out.println("Apellido paterno");
		
		out.println("</td>");
		
		out.println("<td>");
		out.println("calle");
		
		out.println("</td>");
		
		out.println("<td>");
		out.println("colonia");
		
		out.println("</td>");
		
		out.println("<td>");
		out.println("email");
		out.println("</td>");
		
		out.println("<td>");
		out.println("Opciones");
		out.println("</td>");
		
		out.println("</tr>");
		
		
		
		
		for(AlumnoDao  alumnoDao  : alumnos ){
			
			//id
			out.println("<tr>");
		
			out.println("<td>"+alumnos.getClass());
			out.println("</td>");
			
			out.println("<td>"+alumnos.getClass());
			out.println("</td>");
			
			//lugar
			
			out.println("<td>"+ alumnos.getClass());
			out.println("</td>");
			
			//Duracion
		
			out.println("<td>" +alumnos.getClass());
			out.println("</td>");
		
			//Fecha
		
			out.println("<td>"+alumnos.getClass());
			out.println("</td>");
			out.println("<td>");
			//parametro
			out.println("<a href='ServletBorrar?id=" + alumnos.getClass() + "'>"
					+ "<button>");
			out.println("borrar");
			out.println("</button></a>" );
			//out.println( "<a href='Modify?id='" + event.getId( ) + ">Modificar</a>" );
			//out.println( "|" );
			out.println("<a href ='FormularioTabla?edit=true&id="+alumnos.getClass()+"'>"
							+ "<button>");
			out.println("editar");
			out.println("</button></a>");
			
			
			
			out.println("</td>");
			
			
			out.println("</tr>");
			                                                                                   
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>"); 
		    
	
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



