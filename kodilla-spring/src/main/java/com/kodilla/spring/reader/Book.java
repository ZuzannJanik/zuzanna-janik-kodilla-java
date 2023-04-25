package com.kodilla.spring.reader;

import java.util.Objects;

public final class Book {

    final String title;

    public Book(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}