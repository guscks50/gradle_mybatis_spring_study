package gradle_mybatis_spring_study.mapper;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gradle_mybatis_spring_study.config.ContextRoot;
import gradle_mybatis_spring_study.dto.Course;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
public class CourseMapperTest {
	protected static final Log log = LogFactory.getLog(CourseMapperTest.class);

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Autowired
	private CourseMapper mapper;

	@Test
	public void test01SelectCourseByCondition() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", 1);
		List<Course> list = mapper.selectCourseByCondition(map);
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test02SelectCourseByCondition() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("courseName", "%Java%");
		List<Course> list = mapper.selectCourseByCondition(map);
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test03SelectCourseByCondition() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		GregorianCalendar cal = new GregorianCalendar(2013, 1, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startDate", cal.getTime());
		List<Course> list = mapper.selectCourseByCondition(map);
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test04SelectCaseCourse() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		List<Course> list = mapper.selectCaseCourse(map);
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
		map.replace("searchBy", "CourseName");
		map.remove("tutorId");
		map.put("courseName", "%Java%");
		list = mapper.selectCaseCourse(map);
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}
	@Test
	public void test05SelectWhereCourses() {
		log.debug(Thread.currentThread().getStackTrace()[1].getClassName() + "()");
		Map<String,Object> map = new HashMap<String, Object>();
		List<Course> list = mapper.selectwhereCourse(map);
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
		
		map.put("tutorId", 1);
		list = mapper.selectwhereCourse(map);
		list.stream().forEach(System.out::println);
		
		map.put("courseName", "%Java%");
		list = mapper.selectwhereCourse(map);
		list.stream().forEach(System.out::println);
		
		map.clear();
		map.put("endDate", new Date());
		list = mapper.selectwhereCourse(map);
		list.stream().forEach(System.out::println); 
	}
}
