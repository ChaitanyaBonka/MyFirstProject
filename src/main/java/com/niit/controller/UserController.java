package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.dao.LoginDAO;
import com.niit.model.Product;
import com.niit.model.Login;
import com.niit.model.Register;
import com.niit.services.LoginService;

@Controller
public class UserController {

	@Autowired
	LoginService service;
	

	@RequestMapping("ManageUsers")
	public ModelAndView userList(){
		ModelAndView mv9 = new ModelAndView("ManageUsers");
		return mv9;
	}
	@RequestMapping("viewuser")
	public ModelAndView viewuser(){
		ModelAndView mv9 = new ModelAndView("viewuser");
		return mv9;
	}
	/*@RequestMapping(value = "viewuser", method = RequestMethod.GET)
	public ModelAndView viewPro(@RequestParam int id, @ModelAttribute Login loginuser) {
		Login login = service.getSingleLogin(id);
		return new ModelAndView("viewuser", "user", login);
	}*/
	@RequestMapping(value="edituser", method=RequestMethod.GET)
	public ModelAndView edituser(@RequestParam int id){
		Login u1=service.get(id);
		return new ModelAndView("edituser","User",u1);
	}
	/*@RequestMapping(value = "listusers", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String showList()
	{
		List list = service.getAllUsers();
		Gson x = new Gson();
		String json = x.toJson(list);
		return json;
	}*/

	@RequestMapping("Login")
	public ModelAndView display1() {
		ModelAndView mv1 = new ModelAndView("Login");
		return mv1;
	}

	@RequestMapping(value = "/fail2login", method = RequestMethod.GET)
	public ModelAndView loginerror(ModelMap model) {
		return new ModelAndView("Login", "error", true);
	}

	@RequestMapping("register")
	public ModelAndView display2() {

		ModelAndView mv2 = new ModelAndView("register");
		return mv2;
	}


	@RequestMapping("deleteuser")
	public ModelAndView deleteUser(@RequestParam int id,@Valid @ModelAttribute("Login")Login login) {
		service.delete(id);
		ModelAndView m1 = new ModelAndView("ManageUsers");
		return m1;
	}
	
	@ModelAttribute("Register")
	public Register fun12()
	{
		return new Register();
	}

	@ModelAttribute("Login")
	public Login createUser() {
		return new Login();

	}

	@RequestMapping("/Admin")
	public ModelAndView display5() {
		ModelAndView m5 = new ModelAndView("Admin");
		return m5;
	}
	@RequestMapping("/EndUser")
	public ModelAndView display6() {
		ModelAndView m6 = new ModelAndView("EndUser");
		return m6;
	}
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView checkUserOne(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {
		if (request.isUserInRole("ROLE_ADMIN")) {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String str = auth.getName(); // get username
			session = request.getSession(true);
			session.setAttribute("loggedInUser", str);
			// session.invalidate();
			ModelAndView m1 = new ModelAndView("Admin");
			return m1;
		}
		else
		{
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String str = auth.getName();
			session = request.getSession(true);
			session.setAttribute("loggedInUser", str);
			ModelAndView m2 = new ModelAndView("EndUser");
			return m2;
		}
		
	}
	@RequestMapping(value="/updateuser",method=RequestMethod.POST)
    public ModelAndView updateUser(HttpServletRequest request,@Valid @ModelAttribute("Login")Login editlogin,BindingResult result)
    {
		service.update(editlogin);
		return new ModelAndView("ManageUsers");
    }

}

