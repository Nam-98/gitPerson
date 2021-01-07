package kh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.PersonDAO;

@Service
public class PersonService {

	@Autowired
	private PersonDAO dao;
	
	public List<PersonDAO> getAll() throws Exception{
		return dao.getAll();
	}
	
}
