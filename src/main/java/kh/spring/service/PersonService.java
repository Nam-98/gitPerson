package kh.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dao.PersonDAO;

@Repository
public class PersonService {
	
	@Autowired
	private PersonDAO pdao;
	
	public int personInput(String name, String contact) throws Exception{
		return pdao.personInput(name,contact);
	}

}
