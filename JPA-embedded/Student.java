package com.proje.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date birthOfDate;

    @Embedded
    private Contact contact;

    public Student(){
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                '}';
    }

    public Student( String firstName, String lastName, Date birthOfDate, Contact contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.contact = contact;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }
}
