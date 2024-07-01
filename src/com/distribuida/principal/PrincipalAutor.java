package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.AutorDAOImpl;
import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
		
		
		// CRUD
		// add
		Autor autor = new Autor(0,"autor1","apellido1","pais1","direccion1","telefono1","correo1");
		//autorDAO.add(autor);
		
		// up
		Autor autor2 = new Autor(54,"autor2","apellido2","pais2","direccion2","telefono2","correo2");
		//autorDAO.up(autor2);
		
		// del
		autorDAO.del(54);
		
		// findOne
		//System.out.println("************ DEL **************** "+autorDAO.findOne(54));
		try {System.out.println("************ DEL **************** "+autorDAO.findOne(54));} catch(Exception e) { e.printStackTrace();}
		// find All
	 autorDAO.findAll().forEach(item -> { System.out.println(item.toString());  });
	
	 
	 
	context.close();
		
	}

}
