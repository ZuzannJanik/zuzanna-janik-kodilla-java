package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library #1");
        library.getBooks().add(new Book("Book A", "Author 1", LocalDate.of(2000,12,31)));
        library.getBooks().add(new Book("Book B", "Author 2", LocalDate.of(2000,11,30)));
        library.getBooks().add(new Book("Book C", "Author 3", LocalDate.of(2000,10,31)));

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library clonedLibrary2 = null;
        try {
            clonedLibrary2 = library.deepCopy();
            clonedLibrary2.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, clonedLibrary2.getBooks().size());
    }
}
