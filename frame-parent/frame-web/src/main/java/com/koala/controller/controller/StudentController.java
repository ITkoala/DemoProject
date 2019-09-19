package com.koala.controller.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.koala.model.Student;
import com.koala.service.StudentService;
/**
 * 
 * TODO controller
 * @author lsy
 * @date 2019年9月19日
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	/** 日志 */
	private Logger logger = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private StudentService studentService;
	/**
	 * 
	 * TODO 查询
	 * @author lsy
	 * @date 2019年9月19日
	 */
	@RequestMapping("/list")
	public ModelAndView list(Student student) {
		List<Student> list = studentService.list(student);
		String string = JSONArray.toJSONString(list);
		logger.info("返回数据{}", string);
		ModelAndView view = new ModelAndView();
		view.addObject("list",list);
		view.setViewName("student");
		return view;
	}
	/**
	 * 
	 * TODO 查询
	 * @author lsy
	 * @date 2019年9月19日N:fD;oNWz5>t
	 */
	@RequestMapping("/add")
	public ModelAndView add(Student student) {
		studentService.add(student);
		ModelAndView view = new ModelAndView();
		view.addObject("msg","新增成功");
		view.setViewName("student");
		return view;
	}
}
