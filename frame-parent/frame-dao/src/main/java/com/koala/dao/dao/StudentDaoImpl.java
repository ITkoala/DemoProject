package com.koala.dao.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koala.dao.StudentDao;
import com.koala.dao.mapper.StudentMapper;
import com.koala.model.Student;
import com.koala.model.StudentExample;

/**
 * 
 * TODO 持久层
 * 
 * @author lsy
 * @date 2019年9月19日
 */
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private StudentMapper studentMapper;

	/**
	 * 
	 * TODO 查询
	 * 
	 * @author lsy
	 * @date 2019年9月19日
	 */
	public List<Student> list() {
		StudentExample example = new StudentExample();
		List<Student> list = studentMapper.selectByExample(example);

		return list;
	}

	/**
	 * 
	 * TODO 新增
	 * 
	 * @author lsy
	 * @date 2019年9月19日
	 */
	public void add(Student student) {
		// TODO Auto-generated method stub

	}

}
