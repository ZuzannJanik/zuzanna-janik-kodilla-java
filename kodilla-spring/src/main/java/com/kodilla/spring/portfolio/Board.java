package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public TaskList getToDoList() {
        return toDoList;
    }
    public TaskList getInProgressList() {
        return inProgressList;
    }
    public TaskList getDoneList() {
        return doneList;
    }
  /*  public void printList() {
        System.out.println("TO DO LIST:");
        System.out.println(toDoList);
        System.out.println("IN PROGRESS LIST:");
        System.out.println(inProgressList);
        System.out.println("DONE LIST:");
        System.out.println(doneList);
    }
*/}
