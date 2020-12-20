package com.proje.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lessonId;

    private String lessonName;

    private String lessonTeacherName;

    private int lessonCredit;

    @ManyToMany(mappedBy = "lessons")
    private List<Student> students= new ArrayList<Student>();

    public Lesson(String lessonName, String lessonTeacherName, int lessonCredit) {
        this.lessonName = lessonName;
        this.lessonTeacherName = lessonTeacherName;
        this.lessonCredit = lessonCredit;
    }

    public Lesson(){

    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonTeacherName() {
        return lessonTeacherName;
    }

    public void setLessonTeacherName(String lessonTeacherName) {
        this.lessonTeacherName = lessonTeacherName;
    }

    public int getLessonCredit() {
        return lessonCredit;
    }

    public void setLessonCredit(int lessonCredit) {
        this.lessonCredit = lessonCredit;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
