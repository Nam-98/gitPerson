package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.PersonDAO;
import kh.spring.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService pservice;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("output.person")
	public String toOutput(Model model) throws Exception{
		List<PersonDAO> list = pservice.getAll();
		model.addAttribute("list",list);
		return "outputView";
	}
	
	@ExceptionHandler
	public String exceptionalHandler(Throwable e) {
		e.printStackTrace();
		return "error";
	}
	
}
