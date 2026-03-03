package com.caselab.task.modules.book.controller;

import com.caselab.task.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

public class BookController {
    List<Book> books = Arrays.asList(
            new Book(1, "Война и мир", "Толстой", 1869),
            new Book(2, "Преступление и наказание", "Достоевский", 1866),
            new Book(3, "Мастер и Маргарита", "Булгаков", 1967)
    );
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
       Book book= Book.FindById(id);
       if (book != null){
            return ResponseEntity.ok(book);
       }
       return ResponseEntity.notFound().build();
    }
}
