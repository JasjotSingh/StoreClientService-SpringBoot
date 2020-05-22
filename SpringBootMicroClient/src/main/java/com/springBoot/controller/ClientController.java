package com.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.springBoot.model.ProductList;

@Controller
public class ClientController {

	@GetMapping("/")
	public ModelAndView homePageClient() {
		ModelAndView mnv = new ModelAndView("home");
		mnv.addObject("test", "this is a test str");
		return mnv;
	}
	
	@GetMapping("/samsung")
	public ModelAndView samsungClient() {
		ModelAndView mnv = new ModelAndView("samsung");
		RestTemplate restTemp = new RestTemplate();
		ProductList resp = restTemp.getForObject("http://localhost:8081/samsung/", ProductList.class);
		mnv.addObject("resp", resp);
		return mnv;
	}
	
	@GetMapping("/apple")
	public ModelAndView appleClient() {
		ModelAndView mnv = new ModelAndView("apple");
		RestTemplate restTemp = new RestTemplate();
		ProductList resp = restTemp.getForObject("http://localhost:8083/apple/", ProductList.class);
		mnv.addObject("resp", resp);
		return mnv;
	}
}
