package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.*;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Abramczuk", 'M', LocalDate.of(1989, 5, 25), 28));
        userList.add(new ForumUser(2, "Barbados", 'F', LocalDate.of(2001, 9, 15), 8));
        userList.add(new ForumUser(3, "Cesar", 'M', LocalDate.of(1987, 1, 21), 0));
        userList.add(new ForumUser(4, "Dorsz", 'M', LocalDate.of(1995, 5, 1), 10678));
        userList.add(new ForumUser(5, "Eunuch", 'F', LocalDate.of(2002, 2, 13), 59));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
