package kh.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping()
public class PersonController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("input.person")
	public String toInput() {
		return "input";
	}
	
	@RequestMapping("output.person")
	public String toOutput() {
		return "output";
	}
	
	@RequestMapping("delete.person")
	public String deletePerson(HttpServletRequest request) throws Exception{
		int seq = Integer.parseInt(request.getParameter("seq"));
		int result = service.deletePerson(seq);
		request.setAttribute("result", result);
		return "/";
	}
}
