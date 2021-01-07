package kh.spring.service;

import org.springframework.stereotype.Repository;

@Repository
public class PersonService {
	public int  deletePerson(int seq) {
		return dao.deletePerson(seq);
	}
}
