package com.koala.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.koala.dao.mapper.StudentMapper;
import com.koala.model.Student;
import com.koala.model.StudentExample;
import com.koala.service.StudentService;
import com.sun.tools.javac.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	public List<Student> list(Student student) {
		StudentExample example = new StudentExample();
		if (student == null) {
			
		}
		return null;
	}

}
