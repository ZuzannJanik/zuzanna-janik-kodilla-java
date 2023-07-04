package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework {
    private final String mentorName;
    private int updateHomeworks;
    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeworkFiles homeworkFiles) {
        System.out.println(mentorName + ": New homework to check from " + homeworkFiles.getStudentName() + "\n" +
                " (total: " + homeworkFiles.getHomeworks().size() + " homeworks)");
        updateHomeworks++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateHomeworks() {
        return updateHomeworks;
    }
}
