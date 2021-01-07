package kh.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kh.spring.dao.PersonDAO;
import kh.spring.dto.PersonDTO;
import kh.spring.service.PersonService;


@Controller
public class PersonController {

	@Autowired
	private PersonService pservice;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("personInput.person")
	public String personInput(HttpServletRequest request) throws Exception{
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		System.out.println(name +":" + contact);
		int result = pservice.personInput(name,contact);
		return "home";
	}
	
}
