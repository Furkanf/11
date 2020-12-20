package com.proje.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;
    private String name;
    private String lastName;
    private int class_;

   @OneToOne
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", class_=" + class_ +
                ", laptop=" + laptop +
                '}';
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Student() {
    }

    public Student( String name, String lastName, int class_) {
        this.name = name;
        this.lastName = lastName;
        this.class_ = class_;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClass_() {
        return class_;
    }

    public void setClass_(int class_) {
        this.class_ = class_;
    }
}
