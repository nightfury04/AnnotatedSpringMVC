package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Student;

@Controller
public class AdmissionFormController {
	
	
	@RequestMapping(value="/studentAdmission/requestParamDemo", method=RequestMethod.POST)
	public void demoRequestParam(@RequestParam("studentName") String studentName)
	{
		System.out.println("Student Name:"+studentName);
	}
	
	@RequestMapping(value="/studentAdmission/requestParamMultiDemo", method=RequestMethod.POST)
	public ModelAndView demoRequestParamMulti(@RequestParam Map<String,String> reqParams)
	{
		Student student = new Student();
		student.setStudentName(reqParams.get("studentName"));
		student.setSubjectName(reqParams.get("subjectName"));
		student.setRollNo(Integer.parseInt(reqParams.get("rollNo")));
		student.setClassName(reqParams.get("className"));
		student.setSection(reqParams.get("section"));
		student.setSchoolName(reqParams.get("schoolName"));
		
		ModelAndView modelAndView = new ModelAndView("SuccessPage");
		modelAndView.addObject("headerMessage", "Motu's College of Lull Sciences and Studies.");
		modelAndView.addObject("objStudent",student);
		return modelAndView;
	}
	
	@RequestMapping(value="/studentAdmission", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("objStudent") Student objStudent)
	{
		ModelAndView objModelAndView = new ModelAndView("SuccessPage");
		System.out.println("Student Name : "+objStudent.getStudentName());
		System.out.println("Student Subject Name : "+objStudent.getSubjectName());
		objModelAndView.addObject("headerMessage", "Motu's College of Lull Sciences and Studies.");
		return objModelAndView;
	}
	
	@RequestMapping(value="/AdmissionForm", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView objModelAndView = new ModelAndView("AdmissionForm");
		
		return objModelAndView;
	}
	
	@ModelAttribute
	public void addCommonObjects(Model model)
	{
		model.addAttribute("commonObject", "Welcome to student Admission Portal.");
	}

}
