package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.ClienteDAOImpl;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
			
			// CRUD
			// add
			Cliente cliente = new Cliente(0,"1723597854", "juan", "taipe", "av. por ahi y mas alla.", "0987452316", "jtaipe@correo.com");
			clienteDAO.add(cliente);
			
			// up
			Cliente cliente2 = new Cliente(1, "1723597852", "juan2", "taipe2", "av. por ahi y mas alla.2", "0987452312", "jtaipe2@correo.com");
			clienteDAO.up(cliente2);
			
			// del
			clienteDAO.del(1);
			
			// findOne
			System.out.println("************ DEL **************** "+clienteDAO.findOne(1));
	
			// find All
		// clienteDAO.findAll().forEach(item -> { System.out.println(item.toString());  });
		
			context.close();
		

		
	}

}
