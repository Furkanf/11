package com.springboot.rest.book;

public class Book {

    private String isbn;
    private String name;
    private String writer;
    private int page ;

    public Book() {
    }

    public Book(String isbn, String name, String writer, int page) {
        this.isbn = isbn;
        this.name = name;
        this.writer = writer;
        this.page = page;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
