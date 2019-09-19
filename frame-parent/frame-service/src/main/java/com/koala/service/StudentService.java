package com.koala.service;

import java.util.List;

import com.koala.model.Student;

public interface StudentService {
	public List<Student> list(Student student);
	public void add(Student student);
}
