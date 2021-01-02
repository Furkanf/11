package com.springboot.rest.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBook();
    }

    @RequestMapping("/books/{isbn}")
    public Book getBook(@PathVariable String isbn){
        return bookService.getBook(isbn);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{isbn}")
    public void updateBook(@RequestBody Book book, @PathVariable String isbn){
        bookService.updateBook(isbn ,book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{isbn}")
    public void deleteBook(@PathVariable String isbn){
        bookService.deleteBook(isbn);
    }

}
