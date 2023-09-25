package com.vishnu.universityEventManagement.controller;

import com.vishnu.universityEventManagement.model.Department;
import com.vishnu.universityEventManagement.model.Event;
import com.vishnu.universityEventManagement.model.Student;
import com.vishnu.universityEventManagement.service.EventService;
import com.vishnu.universityEventManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@Validated
public class restController {
	@Autowired
	StudentService studentService;
	@Autowired
	EventService eventService;

	@PostMapping("api/student")
	public String addStudent(@RequestBody @Valid Student student){
		return studentService.addStudent(student);
	}
	@PostMapping("api/event")
	public String addEvent(@RequestBody @Valid Event e){
		return eventService.addEvent(e);
	}

	@PutMapping("api/student/{id}/dept")
	public String updateStudentDepartment(@RequestParam Department department,@PathVariable Integer id){
		return studentService.updateDept(department,id);
	}
	@PutMapping("api/event/{id}")
	public String updateEvent(@RequestBody @Valid Event e,@PathVariable Integer id){
		return eventService.updateEvent(e,id);
	}

	@DeleteMapping("api/student/{id}")
	public String deleteStudent(@PathVariable Integer id){
		return studentService.deleteStudent(id);
	}
	@DeleteMapping("api/event/{id}")
	public String deleteEvent(@PathVariable Integer id){
		return eventService.deleteEvent(id);
	}

	@GetMapping("api/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@GetMapping("api/student/{id}")
	public Student getStudentById(@PathVariable Integer id){
		return studentService.getStudentById(id);
	}
	@GetMapping("api/events/date")
	public List<Event> getAllEventsByDate(LocalDate date){
		return eventService.getAllEventsByDate(date);
	}

}
