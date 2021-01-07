package kh.spring.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.PersonDAO;

import kh.spring.dto.PersonDTO;
import kh.spring.service.PersonService;


import kh.spring.service.PersonService;


@Controller
public class PersonController {

	@Autowired
	private PersonService pservice;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	

	@RequestMapping("inputProc.person")
	public String personInput(HttpServletRequest request) throws Exception{
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		System.out.println(name +":" + contact);
		int result = pservice.personInput(name,contact);
		System.out.println(result);
		return "home";
	}
		
	@RequestMapping("input.person")
	public String toInput() {
		return "input";
	}
	
	@RequestMapping("delete.person")
	public String deletePerson(HttpServletRequest request) throws Exception{
		int seq = Integer.parseInt(request.getParameter("num"));
		System.out.println(seq);
		int result = pservice.deletePerson(seq);
		request.setAttribute("result", result);
		return "redirect:/";
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
