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
 * TODO �־ò�
 * 
 * @author lsy
 * @date 2019��9��19��
 */
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private StudentMapper studentMapper;

	/**
	 * 
	 * TODO ��ѯ
	 * 
	 * @author lsy
	 * @date 2019��9��19��
	 */
	public List<Student> list() {
		StudentExample example = new StudentExample();
		List<Student> list = studentMapper.selectByExample(example);

		return list;
	}

	/**
	 * 
	 * TODO ����
	 * 
	 * @author lsy
	 * @date 2019��9��19��
	 */
	public void add(Student student) {
		// TODO Auto-generated method stub

	}

}