package com.wwd.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.wwd.dubbo.service.StudentService;

/**
 * 
		* ClassName: StudentServiceImpl <br/>
		* Function: 学生业务实现. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{

	public void outTest() {
		System.out.println("dubbo demo out test ok !!!");
	}

}
