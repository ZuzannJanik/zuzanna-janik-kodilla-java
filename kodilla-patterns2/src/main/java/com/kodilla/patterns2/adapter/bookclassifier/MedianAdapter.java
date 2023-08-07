package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookLibraryA) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookLibraryB = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book oldSystem : bookLibraryA) {
            bookLibraryB.put(new BookSignature(oldSystem.getSignature()), new Book(oldSystem.getAuthor(), oldSystem.getAuthor(), oldSystem.getPublicationYear()));
        }
    return medianPublicationYear(bookLibraryB);
    }
}

