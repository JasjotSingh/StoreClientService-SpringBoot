package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.springBoot.model.ProductList;

@Controller
public class ClientController {
	
	private ModelAndView mnv;
	
	@Autowired
	private RestTemplate restTemp;
	
	@GetMapping("/")
	public ModelAndView homePageClient() {
		mnv = new ModelAndView("home");
		mnv.addObject("test", "this is a test str");
		return mnv;
	}
	
	
	@GetMapping("/{provider}")
	public ModelAndView samsungClient(@PathVariable("provider")String provider) {
		ProductList resp;
		
		mnv = new ModelAndView("products");
		
		switch(provider.toLowerCase()) {
			case "samsung":
				resp = restTemp.getForObject("http://SAMSUNGMICROSERVICE/samsung/", ProductList.class);
				break;
			case "apple":
				resp = restTemp.getForObject("http://APPLEMICROSERVICE/apple/", ProductList.class);
				break;
			default:
				resp = new ProductList();
		}
		 
		mnv.addObject("resp", resp);
		return mnv;
	}
	
}
