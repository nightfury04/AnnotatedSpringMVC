package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Student;

@Controller
public class AdmissionFormController {
	
	@RequestMapping(value="/studentAdmission", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("objStudent") Student objStudent)
	{
		ModelAndView objModelAndView = new ModelAndView("SuccessPage");
		System.out.println("Student Name : "+objStudent.getStudentName());
		System.out.println("Student Subject Name : "+objStudent.getSubjectName());
		return objModelAndView;
	}
	
	@RequestMapping(value="/AdmissionForm", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView objModelAndView = new ModelAndView("AdmissionForm");
		
		return objModelAndView;
	}
	
	@ModelAttribute
	public void addCommonObjects(Model objModelAndView)
	{
		objModelAndView.addAttribute("commonObject", "Welcome to student Admission Portal.");
	}

}
