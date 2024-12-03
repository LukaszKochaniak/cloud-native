package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistsException extends RuntimeException {

    BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
