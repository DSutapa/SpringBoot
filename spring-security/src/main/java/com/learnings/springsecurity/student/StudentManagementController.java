package com.learnings.springsecurity.student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="/management/api/students")
public class StudentManagementController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"James Bond"),
            new Student(2,"Anna Smith"),
            new Student(3,"Maria Jones"));
    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ADMINTRAINEE')")
    public  List<Student> getSTUDENTS() {
        return STUDENTS;
    }
    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void registerNewStudent(@RequestBody Student student){
        System.out.println(student);
    }
    @DeleteMapping(path="{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudents(@PathVariable ("studentId") Integer studentId){
        System.out.println(studentId);
    }
    @PutMapping(path="{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable ("studentId")Integer studentId, @RequestBody Student student){
        System.out.println(String.format("%s %s",studentId,student));
    }
}
