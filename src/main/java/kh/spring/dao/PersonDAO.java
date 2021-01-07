package kh.spring.dao;


import java.util.HashMap;
import java.util.Map;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

	@Autowired
	private SqlSession db;

	public int deletePerson(int seq) {
		return db.delete("Person.delete",seq);
	}

	public List<PersonDAO> getAll() throws Exception{
		return db.selectList("Person.getAllList");

	}
	public int personInput(String name, String contact) throws Exception{
		Map<String,String> param = new HashMap<>();
		param.put("name", name);
		param.put("contact",contact);
		return db.insert("Person.insert",param);
	}
}
