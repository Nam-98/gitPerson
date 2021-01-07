package kh.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	public int deletePerson(int seq) {
		return db.delete("Person.delete",seq);
	}
}
