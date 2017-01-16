package com.niit.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import com.niit.model.Supplier;
import com.niit.services.SupplierService;

@Controller

public class SupplierController {

	@Autowired
	SupplierService service2;

	@ModelAttribute("Supplier")
	public Supplier createSupplier() {
		return new Supplier();
	}
	
	@RequestMapping("addsupplier")
	public ModelAndView display3() {

		ModelAndView mv3 = new ModelAndView("addsupplier");
		return mv3;
	}

	@RequestMapping("ManageSuppliers")
	public ModelAndView display11() {
		ModelAndView m10 = new ModelAndView("ManageSuppliers");
		return m10;
	}

	@RequestMapping(value = "listsup", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String showList()
	{
		List list = service2.getAllSuppliers();
		Gson x = new Gson();
		String json = x.toJson(list);
		return json;
	}
	@RequestMapping("viewsupplier")
	public ModelAndView display12() {
		ModelAndView m6 = new ModelAndView("viewsupplier");
		return m6;

	}
	@RequestMapping(value = "viewsupplier", method = RequestMethod.GET)
	public ModelAndView viewSup(@RequestParam int id, @ModelAttribute Supplier suppliers) {
		Supplier supplier = service2.getSingleSupplier(id);
		return new ModelAndView("viewsupplier", "supplier", supplier);
	}
	 		 
	 @RequestMapping("editsupplier")
		public ModelAndView display15() {
			ModelAndView m6 = new ModelAndView("editsupplier");
			return m6;

		}		 		 
	 @RequestMapping(value="editsupplier",method=RequestMethod.GET)
	    public ModelAndView editSup(@RequestParam int id){
		 Supplier supplier1=service2.getSingleSupplier(id);
	    	return new ModelAndView("editsupplier","Supplier",supplier1);
	    }
	 @RequestMapping(value="updatesupplier",method=RequestMethod.POST)
	    public ModelAndView updateSupplier(HttpServletRequest request,@Valid @ModelAttribute("Supplier")Supplier editsup,BindingResult result,Model model)
	    {
			service2.update(editsup);
			return new ModelAndView("ManageSuppliers");
	    }	
	 @RequestMapping("/deletesupplier")
		public ModelAndView deleteSupplier(@RequestParam int id) {
			service2.delete(id);
			ModelAndView m1 = new ModelAndView("ManageSuppliers");
			return m1;
		}
	 
	 @RequestMapping("storesupplier")
		public String addBook(HttpServletRequest request, @Valid @ModelAttribute("Supplier") Supplier supplier,
				BindingResult result) {
			if (result.hasErrors()) {
				return "addsupplier";
			}
			service2.saveOrUpdate(supplier);
			return "ManageSuppliers";

		}
	
	
}
