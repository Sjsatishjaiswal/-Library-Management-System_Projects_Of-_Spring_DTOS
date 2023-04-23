package com.example.LibraryManagementSystem.controller;



import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/book")
public class
BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) throws Exception {

        return bookService.addBook(book);
    }

    // find all the books

    // find all the books of a particular authorId

    // // find the number of books written by an autho
}
