package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.entity.EProductEntity;
import com.ecommerce.service.EProductService;

@Controller
public class EProductController {

	@Autowired
	private EProductService eproductService;
	
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public String listProduct(ModelMap map)
	{
		map.addAttribute("eproduct", new EProductEntity());
		map.addAttribute("productList", eproductService.getAllProducts());
		
		return "result";
	}
	
}
