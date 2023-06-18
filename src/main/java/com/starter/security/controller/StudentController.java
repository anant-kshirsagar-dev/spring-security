package com.starter.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starter.security.model.Student;
import com.starter.security.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return studentService.getStudentById(id);
	}

	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		return studentService.deleteStudentById(id);
	}
}
