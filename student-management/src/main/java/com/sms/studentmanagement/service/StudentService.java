package com.sms.studentmanagement.service;

import com.sms.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService{

    public List<Student> getAllStudents();
    public Student saveStudent(Student student);
    public Student getStudentById(Long id);
    public void deleteStudent(Long id);
    public Student updateStudent(Student student);
}
