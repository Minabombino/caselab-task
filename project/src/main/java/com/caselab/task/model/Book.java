package com.caselab.task.model;


import lombok.Setter;

import java.util.Arrays;
import java.util.List;

public class Book {
    public int id;
    public String title;
    public String author;
    public Integer year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
     }
     

    public Book() {

    }

    public static Book FindById(int id, List<Book> books) {
        // здесь мы делаем поиск по массиву this.books
        for (int i = 0; i < books.toArray().length; i++) {
            if (books.get(i).id == id) {
                return books.get(i);
            }
        }
        return null;
    }
}