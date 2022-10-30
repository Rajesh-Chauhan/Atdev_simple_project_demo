package com.atdev.services;

import java.util.List;

import com.atdev.entitites.Student;


public interface StudentService {
	
    public Student saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student updateStudent(Long id, Student student);
	
	public String deleteStudent(long id);
	 


}
