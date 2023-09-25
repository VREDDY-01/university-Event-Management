package com.vishnu.universityEventManagement.service;

import com.vishnu.universityEventManagement.model.Department;
import com.vishnu.universityEventManagement.model.Student;
import com.vishnu.universityEventManagement.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;

	public String addStudent(Student student) {
		studentRepo.save(student);
		return "Added new student";
	}

	public String updateDept(Department department,Integer id) {
		Student s = studentRepo.findById(id).orElse(null);
		if (s!=null){
			s.setDepartment(department);
			studentRepo.save(s);
			return "updated department od student "+id;
		}else{
			return "error finding student with id"+id;
		}
	}

	public String deleteStudent(Integer id) {
		studentRepo.deleteById(id);
		return "student with id "+id+" is deleted";
	}

	public List<Student> getAllStudents() {
		return (List<Student>) studentRepo.findAll();
	}

	public Student getStudentById(Integer id) {
		return studentRepo.findById(id).orElse(null);
	}
}
