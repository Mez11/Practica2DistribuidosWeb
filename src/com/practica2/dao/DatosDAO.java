package com.practica2.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.practica2.entidades.Datos;

public class DatosDAO {
		 private static final String
		 SQL_DATOS="{CALL Grafiquita}";
		 
		 private Connection con =null;
		 private void obtenerConexion(){
			 try{
				 Class.forName("com.mysql.jdbc.Driver");
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practica2db","root","helado11");
			 }catch(Exception e){
			 System.out.println();
				 
			 }
		 }

	 public List<Datos> grafica(){
		 CallableStatement cs = null;
		 ResultSet rs = null;
		 List<Datos>list = new ArrayList<Datos>();
		 obtenerConexion();
		 
		 try {
			 cs = con.prepareCall(SQL_DATOS);
			 rs = cs.executeQuery();
			 
			 while(rs.next()){
				 Datos datos = new Datos();
				 datos.setAlumnosTotales(rs.getInt("alumnosTotales"));
				 datos.setCarrera(rs.getString("carrera"));
				 list.add(datos);
				 
			 }
		 }catch (Exception e){
			e.printStackTrace();
		 }finally{
			 System.out.println("");
			  
			 
		 }	 
		 
		 return list;
	 }
	}




