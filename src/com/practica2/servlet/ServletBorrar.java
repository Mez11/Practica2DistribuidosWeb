package com.practica2.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica2.dao.AlumnoDao;
import com.practica2.entidades.Alumno;



	/**
	 * Servlet implementation class ServletBorrar
	 */
	@WebServlet("/ServletBorrar")
	public class ServletBorrar extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ServletBorrar() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
			
			//request.getParameter("id");
			//String hola = "Hola";
			
			String id = request.getParameter("id");
			System.out.println(id);
			
			AlumnoDao dao = new AlumnoDao();
			//Abrir conection
			dao.getSessionFactory();
			
			Alumno al = new Alumno();
			 
			 //Evento e = new Evento();
			 al.setMatricula(Long.parseLong(id));
			 //e.getId();
			
			 
			dao.getSessionFactory();
			response.sendRedirect("ServletTabla");
			
					
			
		}
		
		

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}


