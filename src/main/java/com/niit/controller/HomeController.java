package com.niit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.LoginDAO;
import com.niit.dao.RegisterDAO;
import com.niit.model.Login;
import com.niit.model.Register;
import com.niit.services.LoginService;
import com.niit.services.RegisterService;

@Controller
public class HomeController {
	@Autowired
	RegisterService service1;
	@Autowired
	LoginService service;

	@RequestMapping("/")
	public ModelAndView fun1() {
		return new ModelAndView("index");
	}

	@RequestMapping("/*")
	public ModelAndView fun2() {
		return new ModelAndView("errorPage");
	}

	@ModelAttribute("Register")
	public Register fun12() {
		return new Register();
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String login() {
		return "Login";
	}

	/*
	 * @RequestMapping(value = "/fail2login", method = RequestMethod.GET) public
	 * ModelAndView loginerror(ModelMap model) { return new
	 * ModelAndView("Login", "error", true); }
	 */

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	@RequestMapping(value = "/viewproducts", method = RequestMethod.GET)
	public String viewproducts() {
		return "viewproducts";
	}

	@RequestMapping(value = "storeUser", method = RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("Register") Register register, BindingResult result) {
		if (result.hasErrors()) {
			return "register";
		}
		System.out.println(register.getUsername());
		System.out.println(register.getAddress());
		Login l1 = new Login();
		l1.setId(register.getId());
		l1.setUsername(register.getUsername());
		l1.setPassword(register.getPassword());
		l1.setStatus(register.isStatus());
		service.saveOrUpdate(l1);
		service1.saveOrUpdate(register);
		return "Login";
	}

	@RequestMapping("logoutsuccess")
	public ModelAndView logoutpage() {
		ModelAndView mv9 = new ModelAndView("logoutsuccess");
		return mv9;
	}

	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public void logout(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws ServletException, IOException {
		HttpSession newsession = request.getSession(false);
		if (newsession != null) {
			newsession.invalidate();

		}
		response.sendRedirect("j_spring_security_logout");
	}

}
