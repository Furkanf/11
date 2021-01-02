package com.springboot.rest.book;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("456456873","kitap1","mehmet",271),
            new Book("123123789","kitap2","ahmet",371),
            new Book("345123902","kitap3","ali",125),
            new Book("564562341","kitap4","kemal",543)
    ));

    public Book getBook(String isbn){
        return books.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst().get();
    }

    public List<Book> getAllBook(){
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBook(String isbn, Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getIsbn().equals(isbn)){
                books.set(i, book);
                return;
            }
        }
    }

    public void deleteBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }
}
