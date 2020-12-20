package com.proje.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @NotNull
    private String firstName;

    @Column(name = "soyad")
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthOfDate;

    @ElementCollection
    @CollectionTable(name = "StudentBooks",joinColumns = @JoinColumn(name = "StudentId"))
    @Column(name = "book_name",length = 15, nullable = false)
    private List<Book> books = new ArrayList<Book>();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="phoneNumber",
                    column=@Column(name="telefon")),
            @AttributeOverride(name="email",
                    column=@Column(name="mail"))
    })
    private Contact contact;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Student( String firstName, String lastName, Date birthOfDate, Contact contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Student(){
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", books=" + books +
                ", contact=" + contact +
                '}';
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
