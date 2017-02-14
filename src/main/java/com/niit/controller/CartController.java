package com.niit.controller;

import java.util.List;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
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

import com.niit.model.BillingAddress;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.Product;
import com.niit.model.Register;
import com.niit.model.ShippingAddress;
import com.niit.services.CartService;
import com.niit.services.LoginService;
import com.niit.services.ProductService;

@Controller
public class CartController 
{
	@Autowired
	ProductService service3;
	@Autowired
	CartService service4;
	@Autowired
	LoginService service;
	SessionFactory sf;
	
	   @ModelAttribute("CartItem")
	    public CartItem fun100()
	    {
	    	return new CartItem();
	    }
	   @ModelAttribute("Cart")
	    public Cart fun200()
	    {
	    	return new Cart();
	    }
	
	 @RequestMapping(value="/viewCart",method=RequestMethod.GET)
		public String vcHello(@RequestParam int id)
		{  
	    System.out.println("Id..........."+id);
	    System.out.println("hello .................");
	    Product product=service3.getSingleProduct(id);
	    CartItem cartItem=new CartItem();
	    // cart.setGrandTotal(chair.getChairPrice());
	   	System.out.println(product.getId());
	   	List list=service4.getAllItems();
	   	System.out.println("List size......."+list.size());
	   	for(int i=0;list.size()>i;i++)
	   	{
	   	  CartItem cti=(CartItem)list.get(i);
	   	  if(id==cti.getId())
	   	  {
	   		    		  
	   		  System.out.println("chaitanya");
	    cartItem.setId(product.getId());
	    cartItem.setName(product.getName());
	    cartItem.setPrice(product.getPrice());
	    cartItem.setDescription(product.getDescription());
	   cartItem.setStyle(product.getStyle());
	   cartItem.setQuantity(cartItem.getQuantity()+1+cti.getQuantity());
	   System.out.println("#######"+cartItem.getQuantity());
	    cartItem.setPrice(product.getPrice()*cartItem.getQuantity());
	     System.out.println("#######"+cartItem.getPrice());
	    service4.add(cartItem);
        int count=cartItem.getCartItemId();
        service4.remove(--count);
       
	    
	    return "viewCart";
	   	}
	   	}
	   	System.out.println("chaitu");
	   	cartItem.setId(product.getId());
	    cartItem.setName(product.getName());
	    cartItem.setPrice(product.getPrice());
	    cartItem.setDescription(product.getDescription());
	    cartItem.setStyle(product.getStyle());
	    cartItem.setQuantity(cartItem.getQuantity()+1);
	    System.out.println("#######"+cartItem.getQuantity());
	    cartItem.setPrice(product.getPrice()*cartItem.getQuantity());
	    System.out.println("#######"+cartItem.getPrice());
	    service4.add(cartItem);    
		  
	    return "viewCart";
	    }
		  
	 @RequestMapping(value="/listone",method=RequestMethod.GET,produces="application/json")
	    public @ResponseBody String showListOne(){
	    	List blist=service4.getAllItems();
	    	Gson x=new Gson();
	    	String json=x.toJson(blist);
	    	return json;
	    }
	 @RequestMapping("/deleteItemCart")
	    public ModelAndView deleteProduct(@RequestParam int id)
	    {
		 System.out.println("------------"+id+"-----------");
		 System.out.println("hello welcome to cart");
         service4.remove(id);
	    	return new ModelAndView("viewCart");
	    }
	 @RequestMapping("/removeAll")
	 public ModelAndView removeAllItem()
	 {
		 service4.removeAll();
		 return new ModelAndView("viewCart");
	 }
	 @RequestMapping("/alert")
	 public ModelAndView dis()
	 {
		  return new ModelAndView("alert");
	 }
	 @RequestMapping("/v1")
	 public ModelAndView disp()
	 {
		  return new ModelAndView("ViewPro");
	 }
	 @RequestMapping(value="hello")
	    public String createOrder(HttpSession session,Model m1)
		{
		 String name=(String)session.getAttribute("loggedInUser");
		 Session s1=sf.openSession();
		 Transaction t=s1.beginTransaction();
		 Query q=s1.createQuery("from Register where name='"+name+"'");
	     List<Register> li=q.list();
	      Register count=li.get(0);
	     Register register=(Register)s1.get(Register.class,count.getId());
		 System.out.println(register.getUsername()+"hello hello");
		 System.out.println("#########################"+name+"@@@@@@@@@@@@@@@@@@@@@@"); 
		 BillingAddress ba=new BillingAddress();
		 ba.setStreetName(register.getStreetName());
		 ba.setApartmentNumber(register.getApartmentNumber());
		 ba.setCity(register.getCity());
		 ba.setState(register.getState());
		 ba.setCountry(ba.getCountry());
		 ba.setZipCode(register.getZipCode());
		 ShippingAddress sa=new ShippingAddress();
		 sa.setStreetName(register.getStreetName());
		 sa.setApartmentNumber(register.getApartmentNumber());
		 sa.setCity(register.getCity());
		 sa.setState(register.getState());
		 sa.setCountry(ba.getCountry());
		 sa.setZipCode(register.getZipCode());	
		 m1.addAttribute("user1",new Register());
		 System.out.println(ba.getApartmentNumber());
		 System.out.println(ba.getState());
		 //ModelAndView m3=new ModelAndView("collectCustomerInfo","Register",register);
		// m1.addAttribute("Register",register);
		 //return new ModelAndView("collectCustomerInfo","register",register);
		return "redirect:/checkout"+register;	
	    }
	 
	 @ModelAttribute("billingAddress")
	    public BillingAddress fun100256()
	    {
	    	return new BillingAddress();
	    }
	 @RequestMapping(value="orderConfirmation",method=RequestMethod.GET)
	    public ModelAndView fun1009()
	    {
	    	return new ModelAndView ("orderConfirmation");
	    }
	 @RequestMapping(value="hellohi")
	 public ModelAndView fun1003(HttpSession session,Model m1)
	 {
		 String name=(String)session.getAttribute("loggedInUser");
		 Session s1=sf.openSession();
		 Transaction t=s1.beginTransaction();
		 Query q=s1.createQuery("from Register where name='"+name+"'");
	     List<Register> li=q.list();
	      Register count=li.get(0);
	     Register register=(Register)s1.get(Register.class,count.getId());
	     System.out.println(register.getApartmentNumber());
	     System.out.println(register.getMailid());
		 return new ModelAndView("orderConfirmation","Register",register);
	 }
	 
	 @RequestMapping(value="viewCart1",method=RequestMethod.GET)
	    public ModelAndView fun1090()
	    {
	    	return new ModelAndView ("viewCart1");
	    }
	 @RequestMapping(value="checkOutCancelled",method=RequestMethod.GET)
	    public ModelAndView fun1091()
	    {
	    	return new ModelAndView ("checkOutCancelled");
	    }
	 @RequestMapping(value="thankCustomer",method=RequestMethod.GET)
	    public ModelAndView fun1092()
	    {
	    	return new ModelAndView ("thankCustomer");
	    }
	 @RequestMapping(value="/checkOut",method=RequestMethod.GET)
	    public void createOrder()
		{
			
			System.out.println("Hello Chaitu How ARE YOU ????????????");
			
			
	    }

	
	 
	 
}
