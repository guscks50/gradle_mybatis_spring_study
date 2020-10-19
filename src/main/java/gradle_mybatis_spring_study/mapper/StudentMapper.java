package gradle_mybatis_spring_study.mapper;

import java.util.List;
import java.util.Map;

import gradle_mybatis_spring_study.dto.Student;

public interface StudentMapper {
	//typeHandler 이용
	Student selectStudentByNo(Student student);
	//resultMap 이용
	Student selectStudentByNoWithResultMap(Student student);
	
	List<Student> selectStudentByAll();
	
	int insertStudent(Student studnet);
	
	int deleteStudent(int id);
	
	List<Student> selectStudentByAllForResultMap();
	
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	/* 내포된결과매핑(ResultMap)을사용한일대일매핑*/
	Student selectStudentByNoAssociation(Student student);
	
	int insertEnumStudent(Student student);
	
	/* 여러 개의 입력 파라미터 전달 */

	Student selectStudentByMap(Map<String, String> map);
	
	List<Student> selectAllStudentByMap(Map<String, String> map);
	
	/* ResultSet 처리방식의 재정의 */
	Map<Integer, Student> selectStudentForMap(Student student);

}
