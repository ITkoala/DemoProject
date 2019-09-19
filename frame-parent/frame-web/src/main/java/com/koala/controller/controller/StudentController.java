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
 * @date 2019��9��19��
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	/** ��־ */
	private Logger logger = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private StudentService studentService;
	/**
	 * 
	 * TODO ��ѯ
	 * @author lsy
	 * @date 2019��9��19��
	 */
	@RequestMapping("/list")
	public ModelAndView list(Student student) {
		List<Student> list = studentService.list(student);
		String string = JSONArray.toJSONString(list);
		logger.info("��������{}", string);
		ModelAndView view = new ModelAndView();
		view.addObject("list",list);
		view.setViewName("student");
		return view;
	}
	/**
	 * 
	 * TODO ��ѯ
	 * @author lsy
	 * @date 2019��9��19��N:fD;oNWz5>t
	 */
	@RequestMapping("/add")
	public ModelAndView add(Student student) {
		studentService.add(student);
		ModelAndView view = new ModelAndView();
		view.addObject("msg","�����ɹ�");
		view.setViewName("student");
		return view;
	}
}
