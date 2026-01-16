package de.seuhd.observer;

public abstract class Subject {
    // Add fields.
    private java.util.List<Observer> observers = new java.util.ArrayList<>();

    void attach(Observer observer) {
        // Implement attach method.
        this.observers.add(observer);
    }

    void detach(Observer observer) {
        //  Implement detach method.
        this.observers.remove(observer);
    }

    protected void notifyObservers() {
        // Implement fireUpdate method.
        System.out.println("Value of System updated to "+ ((ConcreteSubject) this).getValue());
        System.out.println("Sending update to observers...");

        for (Observer observer : observers) {
            observer.update(this);
            System.out.println("Observer "  + " received update from Subject: New Value is " + ((ConcreteSubject) this).getValue());
        }
    }

    
}
