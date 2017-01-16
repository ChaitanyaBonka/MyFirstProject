package com.niit.controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.Product;
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
	 @RequestMapping(value="/checkOut",method=RequestMethod.GET)
	    public void createOrder()
		{
			
			System.out.println("Hello Yogi How ARE YOU ????????????");
			
			
	    }

	
	 
	 
}
