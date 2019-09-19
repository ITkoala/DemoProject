package com.koala.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.koala.dao.StudentDao;
import com.koala.dao.mapper.StudentMapper;
import com.koala.model.Student;
import com.koala.model.StudentExample;
import com.koala.service.StudentService;
/**
 * 
 * TODO ҵ���
 * @author lsy
 * @date 2019��9��19��
 */
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	/**
	 * 
	 * TODO ��ѯ 
	 * @author lsy
	 * @date 2019��9��19��
	 */
	public List<Student> list(Student student) {
		List<Student> list = studentDao.list();
		return list;
	}
	/**
	 * TODO ����
	 * @author lsy
	 * @date 2019��9��19��
	 */
	public void add(Student student) {
		studentDao.add(student);
	}
}
