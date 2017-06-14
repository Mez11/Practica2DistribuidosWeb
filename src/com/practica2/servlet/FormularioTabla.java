package com.practica2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica2.dao.AlumnoDao;
import com.practica2.entidades.Alumno;

import mx.ipn.web.dao.EventoDAO;
import mx.ipn.web.model.Evento;

//public class FormularioTabla {
	
	@WebServlet("/FormularioTabla")
	public class FormularioTabla extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public FormularioTabla() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out =response.getWriter();
			String matricula = null;//para guardar el ID en caso de "update"
			String nombreAlumno = null;
			String paternoAlumno = null;
			String maternoAlumno = null;
			Date fechaNacimiento=null; 
			String calle=null;
			String colonia = null;
			Integer numero = null;
			Double codigoPostal = null;
			Character sexo = null;
			String eMail= null;
			String enviar = null;
			

			Boolean edit = Boolean.parseBoolean( request.getParameter("edit") );
			if( edit ){
				//modo update
				Alumno alumno = new Alumno();
				AlumnoDao dao = new AlumnoDao();
				//dao.inicializarConexion();
				int parsedId =Integer.parseInt(request.getParameter("matricula"));
				enviar = new String("actualizar @-#" );
				
				/*
				 * request.getParameter( ) es para obtener datos del cliente.
				 * En este caso,NO queremos obtener datos del cliente.
				 * Queremos obtener datos de la BASE de DATOS.
				 * Por lo cual,usaremos el objeto que regresamos...
				 */
				//"alumno" contiene los valores de la base de datos.
				//Alumno alumno = dao.getSessionFactory( parsedId );
				if( alumno == null ){
					//Puede ser que el ID especificado no exista.
					//En tal caso, no continuar con el flujo.
					response.sendError( 400, "El ID " + parsedId + " no existe en la BD" );
					return;
				}
			
				DateFormat formatter = new SimpleDateFormat( "dd,mm,yyyy" );
			
				
				//fechaNacimiento = formatter.format(alumno.getFechaNacimiento() );
				
			
				//String duracion = request.getParameter("duracion");
	
				//integer -> String ... Integer.toString( int numee
				//matricula = Integer.toString( alumno.getMatricula() );//Pregunta en este parse por e es INteger.toString
				
				/*
				 * PARSEOS:
				 * String -> Integer:
				 * Sea "s" una cadena que contiene un numero, y "n" una variable de tipo entero:
				 * n = Integer.parseString( s );
				 * 
				 * Integer -> String
				 * Sea "numeroString" una variable de tipo String, y "n" una variable de tipo entero,
				 * que queremos representar como cadena:
				 * numeroSTring = Integer.toString( n );
				 * 
				 * EJEMPLITO
				 * 
				 * int n = 5;
				 * String s = Integer.toString( 5 ); // <-- "s" ahora tiene la cadena "5"
				 * 
				 * String unNumero = "15";
				 * int num = Integer.parseInt( unNumero ); // <-- "num" ahora tiene el entero 15.oh
				 * y asi...ok debo hacer ejecios de paseo.
				 * Puede ser buena idea... suelen ser frecuentes los parseos en programacion
				 * web o movil o cosas que tengan que ver con formularios ok thanks 
				 */
				
				
				nombreAlumno=alumno.getNombreAlumno();
				paternoAlumno=alumno.getPaternoAlumno();
				maternoAlumno=alumno.getMaternoAlumno();
				fechaNacimiento=alumno.getFechaNacimiento();
				calle=alumno.getCalle();
				colonia=alumno.getColonia();
				//numero=Integer.toString(alumno.getNumero());
				numero = alumno.getNumero();
				codigoPostal = (double) alumno.getCodigoPostal();
				sexo = alumno.getSexo();
				eMail= alumno.geteMail();
				
				//Integer.toString( evento.getDuracion() );
				//duracion=Integer.toString(evento.getDuracion());
	
			}else {
				//modo create
				nombreAlumno = ""; 
				paternoAlumno = "";
				maternoAlumno ="";//Duracion
				//fechaNacimiento =;//Fecha
				calle = " " ;
				colonia = "" ;
				//numero = 1 ;
				//codigoPostal = "";
				//sexo = "";
				eMail = "" ;
				enviar = "Agregar"; //Bottton enviar
			}
		
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
			out.println("<form  name='text' action='ServletAlta'>");
			out.println("Nombre<input type='text' value='" + nombreAlumno + "' name ='nombre'/>");
			out.println("Apellido paterno<input type='text' value='"+ paternoAlumno+ "' name='apellidoPaterno'/>");
			out.println("Apellido materno<input type='text'  value='"+maternoAlumno+"' name='apellidoMaterno'/> ");
			out.println("Calle<input type='text' value='"+calle+"' name='calle'/>");
			out.println("Colonia<input type='text' value='"+colonia+"' name='colonia'/>");
			out.println("Email<input type='text' value='"+eMail+"' name='email'/>");
			if( edit ){
				//con esto enviamos el ID al servlet...
				out.println( "<input type='hidden' name='matricula' value='" + matricula + "'/>" );
				out.println("<input type='hidden' name='edit' value='"+edit+"'>");
			}
			
			out.println("<input type='submit' value='" + enviar + " @.@' name='enviar' >");
			
			out.println("</form>");
			out.println("</body>");
			out.println("</head>");
			out.println("</html>");
			
			
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	


}//end class
