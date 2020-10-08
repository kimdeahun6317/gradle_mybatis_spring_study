package gradle_mybatis_spring_study.mapper;

import java.util.List;

import gradle_mybatis_spring_study.dto.Student;

public interface StudentMapper {
	//typeHandler 이용
	Student selectStudentByNo(Student student);
	//resultMap 이용
	Student selectStudentByNoWithResultMap(Student student);
	
	List<Student> selectStudentByAll();
}
