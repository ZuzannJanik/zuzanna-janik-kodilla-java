package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookLibraryA = new HashSet<>();
        bookLibraryA.add(new Book("Author1", "Title1", 2000, "A1"));
        bookLibraryA.add(new Book("Author2", "Title2", 2001, "A2"));
        bookLibraryA.add(new Book("Author3", "Title3", 2002, "A3"));

        //When
        int newSystemMedian = medianAdapter.publicationYearMedian(bookLibraryA);

        //Then
        Assertions.assertEquals(2001, newSystemMedian);
    }
}

