package com.learnings.springsecurity.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
 @RequiredArgsConstructor
 @Data
public class Student {
    private final Integer studentId;
    private final String studentName;

     @Override
     public String toString() {
         return "Student{" +
                 "studentId=" + studentId +
                 ", studentName='" + studentName + '\'' +
                 '}';
     }
 }
