package de.seuhd.observer;


public class ConcreteObserver implements Observer {
    // Add fields and static variables.
    private Subject subject;
    private static int observerCounter= 0;
    private int observerID;



    public ConcreteObserver(Subject subject) {
        //  Implement constructor.
        observerCounter ++;
        this.observerID= observerCounter;
        this.subject= subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        //  Implement update method.

        if (subject instanceof ConcreteSubject){
            int value= ((ConcreteSubject) subject).getValue();
            System.out.println("Observer " + this.observerID + " notified. New Value is: " + value);
        }

    }

    public void detach() {
        // : Implement detach method.
        this.subject.detach(this);
    }
}
