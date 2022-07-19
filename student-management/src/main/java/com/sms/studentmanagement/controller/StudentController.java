package com.sms.studentmanagement.controller;

import com.sms.studentmanagement.entity.Student;
import com.sms.studentmanagement.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping(path="/students")
@Transactional

public class StudentController {
    private final StudentServiceImpl studentServiceImpl;
    @Autowired
    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
//    @GetMapping("login")
//    public String getLogin(){
//        return "login";
//    }
//    @GetMapping("register")
//    public String register(){
//        return "register";
//    }
    @GetMapping("/")
    public String allStudents(Model model){
        List<Student> listStudent= studentServiceImpl.getAllStudents();
        model.addAttribute("listStudent",listStudent);
        return "index";
    }
    @RequestMapping("/addStudent")
    public String createStudentForm(Model model){
        Student newStudent = new Student();
        model.addAttribute("newStudent",newStudent);
        return "create_student";
    }
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute ("student") Student student ){
        studentServiceImpl.saveStudent(student);
        return "redirect:/students/";
    }
    @GetMapping("/edit/{id}")
    public String editStudentPage(@PathVariable (name="id") Long id, Model model){
        model.addAttribute("student",studentServiceImpl.getStudentById(id));
        return "edit_student";
    }
    @PostMapping("/{id}")
    public String updateStudent(@PathVariable ("id") Long id, @ModelAttribute ("student") Student student, Model model){
        //get student from db by id
        Student existingStudent = studentServiceImpl.getStudentById(id);
        existingStudent.setId(student.getId());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        //save updated obj
        studentServiceImpl.updateStudent(student);
        return "redirect:/students/";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable (name="id") Long id){
        studentServiceImpl.deleteStudent(id);
        return "redirect:/students/";
    }

}
