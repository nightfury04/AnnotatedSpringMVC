package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BaseController {
	
	
	@RequestMapping("/Welcome")
	public ModelAndView myMethod()
	{
		ModelAndView objModelAndView = new ModelAndView("FirstPage");
		objModelAndView.addObject("fname", "User");
		return objModelAndView;
	}
	
	@RequestMapping("/Welcome/{firstname}")
	public ModelAndView demoPathVariableSimple(@PathVariable("firstname") String fname)
	{
		ModelAndView objModelAndView = new ModelAndView("FirstPage");
		objModelAndView.addObject("fname", fname);
		return objModelAndView;
	}
	
	@RequestMapping("/Welcome/{countryname}/{firstname}")
	public ModelAndView demoPathVariableMultiple(@PathVariable("firstname") String fname, @PathVariable("countryname") String countryName)
	{
		ModelAndView objModelAndView = new ModelAndView("FirstPage");
		objModelAndView.addObject("fname", fname);
		objModelAndView.addObject("countryname", countryName);
		return objModelAndView;
	}
	
	@RequestMapping("/Welcome/{countryname}/{firstname}/{lastname}")
	public ModelAndView demoPathVariableMap(@PathVariable Map<String,String> pathVars)
	{
		String fname = pathVars.get("firstname");
		String lname = pathVars.get("lastname");
		String countryName = pathVars.get("countryname");
		ModelAndView objModelAndView = new ModelAndView("FirstPage");
		objModelAndView.addObject("fname", fname);
		objModelAndView.addObject("lname", lname);
		objModelAndView.addObject("countryname", countryName);
		return objModelAndView;
	}
	

}
