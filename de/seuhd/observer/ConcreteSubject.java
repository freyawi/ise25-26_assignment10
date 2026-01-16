package de.seuhd.observer;

public class ConcreteSubject extends Subject {
    // : implement concrete subject
    private int value; 

    public void setValue(int newValue) {
        this.value = newValue;
        this.notifyObservers();
    }

    public int getValue()
    {
        return this.value;
    }
    public static void main(String[] args) {
        //Observer melden sich an
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver newObserver1 = new ConcreteObserver( subject);
        ConcreteObserver newObserver2 = new ConcreteObserver( subject);

    
        //Zustandsänderung
        subject.setValue(5);
    

        //Einer der Observer meldet sich ab
        newObserver1.detach();


        //Zustand ändert sich wieder

        subject.setValue(1);
        // jetzt nur noch iener benachrichtigt


        //zweiter observer meldet sich ab
        newObserver2.detach();

        //Zustand ändert sihc erneut, aber keine observer mehr
        subject.setValue(3);
         // keiner wird benachrichtigt
    }

    
}