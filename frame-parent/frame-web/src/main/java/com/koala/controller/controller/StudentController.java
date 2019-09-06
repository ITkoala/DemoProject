package com.koala.controller.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.koala.model.Student;
import com.koala.service.StudentService;
import com.sun.tools.javac.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
	private Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public ModelAndView list(Student student) {
		List<Student> list = studentService.list(student);
		ModelAndView view = new ModelAndView();
		view.addObject("list",list);
		view.setViewName("student");
		return view;
	}

}
