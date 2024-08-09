package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.ClienteDAOImpl;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
			ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
			
			// CRUD
			// add
			//Cliente cliente = new Cliente(52,"1759638659","juan","taipe","av. por ahi y mas alla.","099863253","jtaipe@correo.com");
			//clienteDAO.add(cliente);
			
			// up
			//Cliente cliente2 = new Cliente(51,"1759638652","juan3","taipe3","av. por ahi y mas alla.3","099863253","jtaipe3@correo.com");
			//clienteDAO.up(cliente2);
			
			 //del
			clienteDAO.del(52);
			
			// findOne
			//System.out.println("************ DEL **************** "+clienteDAO.findOne(39));
			try {System.out.println("************ DEL **************** "+clienteDAO.findOne(52));} catch(Exception e) { e.printStackTrace();}
			// find All
		 clienteDAO.findAll().forEach(item -> { System.out.println(item.toString());  });
		
		 
		 
		context.close();
		

		
	}

}
