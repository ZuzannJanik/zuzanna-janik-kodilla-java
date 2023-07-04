package com.kodilla.patterns2.observer.homework;


public interface ObservableHomework {
    void registerObserverHomework(ObserverHomework observerHomework);
    void notifyObserversHomework();
    void removeObserverHomework(ObserverHomework observerHomework);
}
