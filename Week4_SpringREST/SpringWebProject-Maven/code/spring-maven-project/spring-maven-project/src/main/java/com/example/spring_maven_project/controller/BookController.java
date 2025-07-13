package com.example.spring_maven_project.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_maven_project.model.Book;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final Map<Integer, Book> bookRepo = new HashMap<>();
    private int currentId = 1;

    @GetMapping
    public Collection<Book> getAllBooks() {
        return bookRepo.values();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        return bookRepo.get(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        book.setId(currentId++);
        bookRepo.put(book.getId(), book);
        return book;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        book.setId(id);
        bookRepo.put(id, book);
        return book;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookRepo.remove(id);
        return "Book deleted with id: " + id;
    }
}
