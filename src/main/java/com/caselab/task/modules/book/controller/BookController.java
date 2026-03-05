package com.caselab.task.modules.book.controller;

import com.caselab.task.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    public List<Book> books = Arrays.asList(
            new Book(1, "Война и мир", "Толстой", 1869),
            new Book(2, "Преступление и наказание", "Достоевский", 1866),
            new Book(3, "Мастер и Маргарита", "Булгаков", 1967)
    );


    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){

        // Вообще это костыль, но у нас данные в памяти
        Book book = Book.FindById(id, books);

        if (book != null){
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBook(){
        return ResponseEntity.ok(books);
    }
}
