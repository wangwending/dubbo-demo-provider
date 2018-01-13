package com.wwd.dubbo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwd.dubbo.service.StudentService;
import com.wwd.mapper.StudentMapper;
import com.wwd.model.Student;

/**
 * 
		* ClassName: StudentServiceImpl <br/>
		* Function: 学生业务实现. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Autowired
	private StudentMapper studentMapper;

	public void outTest() {
		Student student = studentMapper.selectByPrimaryKey(1);
		log.info("Student Success info {} {} ", student.getId(), student.getName());
		log.info("dubbo demo out test ok !!!");
	}

}
