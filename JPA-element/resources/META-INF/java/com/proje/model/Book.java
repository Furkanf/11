package com.proje.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Book {


     private String ISBN;

     private String bookName;

     private String authorName;

     private String publisherName;

     @Column(name = "sayfa")
     private int page;

     public Book(){

        }
        public Book(String ISBN, String bookName, String authorName, String publisherName, int page) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.page = page;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
