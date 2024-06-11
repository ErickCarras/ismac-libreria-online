package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Autor;

public interface AutorDAO {
	
public List<Autor> findAll();

public Autor finOne(int id);

public void add(Autor Autor);

public void up(Autor autor);

public void del (int id);
	
	
}