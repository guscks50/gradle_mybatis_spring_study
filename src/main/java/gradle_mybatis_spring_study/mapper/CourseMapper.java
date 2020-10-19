package gradle_mybatis_spring_study.mapper;

import java.util.List;
import java.util.Map;

import gradle_mybatis_spring_study.dto.Course;

public interface CourseMapper {
	/* 동적SQL -if 조건*/
	List<Course> selectCourseByCondition(Map<String, Object> map);
	/* 동적SQL -choose 조건*/
	List<Course> selectCaseCourse(Map<String, Object> map);
	
	List<Course> selectwhereCourse(Map<String, Object> map);
}
