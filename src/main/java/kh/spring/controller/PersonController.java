package kh.spring.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.PersonDAO;
import kh.spring.service.PersonService;

@Controller
@RequestMapping()
public class PersonController {

	@Autowired
	private PersonService pservice;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("input.person")
	public String toInput() {
		return "input";
	}
	
	@RequestMapping("delete.person")
	public String deletePerson(HttpServletRequest request) throws Exception{
		int seq = Integer.parseInt(request.getParameter("seq"));
		int result = pservice.deletePerson(seq);
		request.setAttribute("result", result);
		return "/";
	}
	@RequestMapping("output.person")
	public String toOutput(Model model) throws Exception{
		List<PersonDAO> list = pservice.getAll();
		model.addAttribute("list",list);
		return "output";
	}
	
	@ExceptionHandler
	public String exceptionalHandler(Throwable e) {
		e.printStackTrace();
		return "error";
	}
	
}
