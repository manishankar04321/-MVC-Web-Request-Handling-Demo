package com.example.librarymvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.librarymvc.model.Book;

@RestController
public class LibraryController {

    List<Book> bookList = new ArrayList<>();

    // 1. Welcome Message
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System";
    }

    // 2. Count of Books
    @GetMapping("/count")
    public int countBooks() {
        return 100;
    }

    // 3. Book Price
    @GetMapping("/price")
    public double bookPrice() {
        return 499.99;
    }

    // 4. List of Books
    @GetMapping("/books")
    public List<String> getBooks() {

        List<String> books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Spring Boot Guide");
        books.add("Data Structures");

        return books;
    }

    // 5. Book by ID
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book with ID: " + id;
    }

    // 6. Search Book
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book: " + title;
    }

    // 7. Author Name
    @GetMapping("/author/{name}")
    public String authorName(@PathVariable String name) {
        return "Books written by Author: " + name;
    }

    // 8. Add Book
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully!";
    }

    // 9. View Books
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }

}