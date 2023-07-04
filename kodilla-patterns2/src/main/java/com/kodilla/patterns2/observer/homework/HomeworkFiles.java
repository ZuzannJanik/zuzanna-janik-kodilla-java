package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkFiles implements ObservableHomework {
    private final List<ObserverHomework> observers;
    private final List<String> homeworks;
    private final String studentName;
    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getStudentName() {
        return studentName;
    }
    public HomeworkFiles(String studentName) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addHomeworkFile(String file) {
        homeworks.add(file);
        notifyObserversHomework();
    }

    @Override
    public void registerObserverHomework(ObserverHomework observerHomework) {
        observers.add(observerHomework);
    }

    @Override
    public void notifyObserversHomework() {
        for (ObserverHomework observerHomework : observers) {
            observerHomework.update(this);
        }
    }

    @Override
    public void removeObserverHomework(ObserverHomework observerHomework) {
        observers.remove(observerHomework);
    }
}
