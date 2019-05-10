package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;
    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("The Book Title", "The Author", 2000);
        bookList.add(book);

        return bookList;


        }
    }