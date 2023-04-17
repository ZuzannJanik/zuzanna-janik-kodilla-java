package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMapOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + resultMapOfForumUser.size());
        resultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
