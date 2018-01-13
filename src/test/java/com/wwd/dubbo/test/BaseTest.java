package com.wwd.dubbo.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
		* ClassName: BaseTest <br/>
		* Function: Junit测试基类. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-context.xml",
		"classpath:META-INF/spring/spring-dataSource.xml", "classpath:META-INF/spring/spring-dubbo-provider.xml",
		"classpath:META-INF/spring/spring-resource.xml", "classpath:META-INF/spring/spring-mybatis.xml",
		"classpath:META-INF/spring/spring-tx.xml"})
public class BaseTest {

}
