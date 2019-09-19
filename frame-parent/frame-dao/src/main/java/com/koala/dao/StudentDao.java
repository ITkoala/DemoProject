package com.koala.dao;

import java.util.List;

import com.koala.model.Student;

public interface StudentDao {
	public List<Student> list();
	public void add(Student student);
}
