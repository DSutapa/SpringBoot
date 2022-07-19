package com.sms.studentmanagement.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Embeddable
@Table(name="students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name ="first_name" , nullable = false)
    private String firstName;
    @Column(name ="last_name" , nullable = false)
    private String lastName;
    @Column(name ="email" , nullable = false)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
public Student(){

}

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    @Embeddable
    public class StudentInfo implements Serializable{
        private long id;
        private String first_name;
        private String last_name;
        private String email;
    }

}
