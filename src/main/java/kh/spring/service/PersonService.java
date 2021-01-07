package kh.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dao.PersonDAO;
	

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.PersonDAO;



@Service
public class PersonService {
	@Autowired
	private PersonDAO dao;
	
	public int  deletePerson(int seq) throws Exception{
		return dao.deletePerson(seq);

	}

	public List<PersonDAO> getAll() throws Exception{
		return dao.getAll();
	}
	
	public int personInput(String name, String contact) throws Exception{
		return dao.personInput(name,contact);
	}
}
