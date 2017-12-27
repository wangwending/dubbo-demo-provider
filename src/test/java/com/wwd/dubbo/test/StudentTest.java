package com.wwd.dubbo.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wwd.dubbo.service.StudentService;

/**
 * 
		* ClassName: StudentTest <br/>
		* Function: StudentTest. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
public class StudentTest extends BaseTest{
	private static Logger log = LoggerFactory.getLogger(StudentTest.class);
	
	@Autowired
	private StudentService studentService;
	
	@Test
	public void out() {
		studentService.outTest();
		log.info("out junit test!!!");
	}
	
}
