package com.proje.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;
    private String name;
    private String lastName;
    private int class_;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE},mappedBy = "student")
    private List<Laptop> laptop= new ArrayList<Laptop>();

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
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

    public void addLaptop(Laptop laptop) {
        this.laptop.add(laptop);
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
