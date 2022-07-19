package com.sms.studentmanagement.service;

import com.sms.studentmanagement.dao.StudentRepository;
import com.sms.studentmanagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteStudentById(id);
    }


}
