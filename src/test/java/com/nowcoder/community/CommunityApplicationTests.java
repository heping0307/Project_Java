package com.nowcoder.community;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes =  CommunityApplication.class)	//1、需要配置类就使用ContextConfiguration
class CommunityApplicationTests implements ApplicationContextAware {	//2、实现 ApplicationContextAware接口，重写setApplicationContext接口

	private ApplicationContext applicationContext;	//3、添加成员变量

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}
	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);	//org.springframework.web.context.support.GenericWebApplicationContext@6bffbc6d, started on Tue Jun 28 10:35:23 CST 2022
		//从容器中获取Bean的两种方式，第一种是选用优先级高的（Primary），第二种是选用指定Bean命名的；
		AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class);		//依赖接口编程	AlphaDao.class
		System.out.println(alphaDao.select());		//Hiberbate		当在AlphaDaoMyBatislmpl上加上Primary注解后，输出就会变成MyBatis

		alphaDao = applicationContext.getBean("alphaHiberbate",AlphaDao.class);
		System.out.println("强制使用AlphaDao的接口（该接口的Bean叫做alphaHiberbate）：：" + alphaDao.select());
	}

	@Test
	public void testBeanManagement(){
		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}

	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat =
				applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));	//输出当前时间
	}

	@Autowired   //依赖注入
	@Qualifier("alphaHiberbate")	//指定继承AlphaDao中Bean名,
	private AlphaDao alphaDao;

	@Autowired   //依赖注入		每一个依赖注入都要写，如果声明都放在一起，那么从第二个开始都是null
	private AlphaService alphaService;

	@Autowired   //依赖注入
	private SimpleDateFormat simpleDateFormat;

	@Test
	public void testID(){
		System.out.println(alphaDao);
		System.out.println(alphaService);
		System.out.println(simpleDateFormat);
	}

}
