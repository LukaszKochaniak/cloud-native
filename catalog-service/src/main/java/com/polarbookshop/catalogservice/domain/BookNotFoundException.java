package com.polarbookshop.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {
    BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
