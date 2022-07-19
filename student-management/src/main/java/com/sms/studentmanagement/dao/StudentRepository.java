package com.sms.studentmanagement.dao;

import com.sms.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Student findStudentById(Long id);

    void deleteStudentById(Long id);
}
