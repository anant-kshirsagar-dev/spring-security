package com.starter.security.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.starter.security.model.Student;

@Service
public class StudentService {

	private Map<Long, Student> studentDB;

	{
		studentDB = new HashMap<>();
		studentDB.put(1001L, new Student(1001L, "Anant", "MSC", 90.0));
		studentDB.put(1002L, new Student(1002L, "Suyog", "BSC", 98.0));
		studentDB.put(1003L, new Student(1003L, "Rakshit", "M.Tech", 65.0));
		studentDB.put(1004L, new Student(1004L, "Pranav", "BBA", 85.0));
		studentDB.put(1005L, new Student(1005L, "Shubham", "MA", 56.0));
	}

	public Student save(Student student) {
		if (null != student) {
			studentDB.put(student.getId(), student);
		}
		return student;
	}

	public Student getStudentById(Long id) {
		if (null != id) {
			return studentDB.get(id);
		}
		return null;
	}

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentDB.forEach((key, value) -> {
			students.add(value);
		});
		return students;
	}

	public String deleteStudentById(Long id) {
		if (null != studentDB) {
			studentDB.remove(id);
		}
		return "Student with id [" + id + "] removed!";
	}
}
