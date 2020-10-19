package gradle_mybatis_spring_study.mapper;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gradle_mybatis_spring_study.config.ContextRoot;
import gradle_mybatis_spring_study.dto.Gender;
import gradle_mybatis_spring_study.dto.PhoneNumber;
import gradle_mybatis_spring_study.dto.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest {
	private static final Log log = LogFactory.getLog(StudentMapperTest.class);

	@Autowired
	private StudentMapper mapper;

	@After
	public void testDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test03SelectStudentByNo() {
		System.out.println("testSelectStudentByNo()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Student student = new Student();
		student.setStudId(3);

		Student selectStudent = mapper.selectStudentByNo(student);
		Assert.assertNotNull(selectStudent);
		log.debug(selectStudent.toString());
	}

	@Test
	public void testselectStudentByNoWithResultMap() {
		System.out.println("selectStudentByNoWithResultMap()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Student student = new Student();
		student.setStudId(1);

		Student selectStudent = mapper.selectStudentByNoWithResultMap(student);
		Assert.assertNotNull(selectStudent);
		log.debug(selectStudent.toString());
	}

	@Test
	public void test01selectStudentByAll() {
		System.out.println("selectStudentByAll()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Student> list = mapper.selectStudentByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test02insertStudent() {
		System.out.println("insertStudent()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 9, 10);
		Student student = new Student(3, "쏘대장", "abv@naver.com", new PhoneNumber("010-3333-3333"), newDate.getTime());
		int res = mapper.insertStudent(student);
		Assert.assertEquals(1, res);
		System.out.println(res);
	}

	@Test
	public void test04deleteStudent() {
		System.out.println("deleteStudent()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Student student = new Student();
		student.setStudId(3);
		int res = mapper.deleteStudent(student.getStudId());
		Assert.assertEquals(1, res);
		System.out.println(res);
	}

	@Test
	public void test05selectStudentByAllForResutlMap() {
		System.out.println("test00selectStudentByAllForResutlMap()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Student> list = mapper.selectStudentByAllForResultMap();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test06selectselectStudentByAllForHashMap() {
		System.out.println("test06selectselectStudentByAllForHashMap()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Map<String, Object>> list = mapper.selectStudentByAllForHashMap();
		Assert.assertNotNull(list);
		for (Map<String, Object> map : list) {
			for (Entry<String, Object> e : map.entrySet()) {
				log.debug(String.format("%s -> %s", e.getKey(), e.getValue()));
			}
		}
	}

	@Test
	public void test07selectStudentByNoAssociation() {
		System.out.println("selectStudentByNoAssociation()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Student student = new Student();
		student.setStudId(1);
		Student seletedStd = mapper.selectStudentByNoAssociation(student);
		Assert.assertNotNull(seletedStd);
		log.debug(seletedStd.toString());
	}

	@Test
	public void test08InsertEnumStudent() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		Student student = new Student();
		student.setStudId(3);
		student.setName("test");
		student.setEmail("test@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		student.setGender(Gender.FEMAIL);
		int res = mapper.insertEnumStudent(student);
		Assert.assertEquals(1, res);

		student.setStudId(4);
		student.setName("test4");
		student.setEmail("test4@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		student.setGender(Gender.MAIL);
		int res1 = mapper.insertEnumStudent(student);
		Assert.assertEquals(1, res1);

	}
	@Test
	public void test09deleteStudent() {
		
	System.out.println("deleteStudent()");
	log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
	Student student = new Student();
	student.setStudId(3);
	int res = mapper.deleteStudent(student.getStudId());
	Assert.assertEquals(1, res);
	System.out.println(res);
	}
	@Test
	public void test10deleteStudent() {
		
		System.out.println("deleteStudent()");
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Student student = new Student();
		student.setStudId(4);
		int res = mapper.deleteStudent(student.getStudId());
		Assert.assertEquals(1, res);
		System.out.println(res);
		
		
	}

	@Test
	public void test11SelectStudentByMap() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Map<String, String> maps = new HashMap<>();
		maps.put("name", "Timothy");
		maps.put("email", "timothy@gmail.com");
		Student student = mapper.selectStudentByMap(maps);
		Assert.assertNotNull(student);
		log.debug(student.toString());
		maps.remove("email");
		student = mapper.selectStudentByMap(maps);
		log.debug(student.toString());
		maps.clear();
		maps.put("email", "timothy@gmail.com");
		student = mapper.selectStudentByMap(maps);
		log.debug(student.toString());
	}

	@Test
	public void test12SelectAllStudentByMap() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Map<String, String> maps = new HashMap<>();
		maps.put("name", "Timothy");
		maps.put("email", "timothy@gmail.com");
		List<Student> list = mapper.selectAllStudentByMap(maps);
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
		maps.remove("email");
		list = mapper.selectAllStudentByMap(maps);
		list.stream().forEach(System.out::println);
		maps.clear();
		maps.put("email", "timothy@gmail.com");
		list = mapper.selectAllStudentByMap(maps);
		list.stream().forEach(System.out::println);
		maps.clear();
		list = mapper.selectAllStudentByMap(maps);
		list.stream().forEach(System.out::println);
	}

}
