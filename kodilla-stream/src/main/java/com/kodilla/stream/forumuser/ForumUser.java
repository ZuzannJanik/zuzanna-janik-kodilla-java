package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {

    private int idNumber;
    private String userName;
    private char sex;
    private LocalDate birthDate;
    private int numberOfPosts;

    public ForumUser(int idNumber, String userName, char sex, LocalDate birthDate, int numberOfPosts) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
