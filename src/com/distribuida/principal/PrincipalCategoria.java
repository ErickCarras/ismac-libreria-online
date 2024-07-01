package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.CategoriaDAOImpl;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
		// CRUD
		// add
		Categoria categoria = new Categoria(0,"categoria", "descripcion");
		categoriaDAO.add(categoria);
		
		// up
		Categoria categoria2 = new Categoria(2,"categoria2", "descripcion2");
		//categoriaDAO.up(categoria2);
		
		// del
		//categoriaDAO.del(40);
		
		// findOne
		//System.out.println("************ DEL **************** "+clienteDAO.findOne(39));
		//try {System.out.println("************ DEL **************** "+categoriaDAO.findOne(40));} catch(Exception e) { e.printStackTrace();}
		// find All
	 categoriaDAO.findAll().forEach(item -> { System.out.println(item.toString());  });
	
	
	context.close();
	
	}

}
