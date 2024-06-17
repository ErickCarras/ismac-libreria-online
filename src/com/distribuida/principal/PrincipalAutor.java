package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.AutorDAOImpl;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
		List<Autor> autor = autorDAO.findAll();
		
		autor.forEach(item -> {
			
			
			System.out.println(item.toString());
			
			
		});
	
		context.close();
	
		
	}

}
