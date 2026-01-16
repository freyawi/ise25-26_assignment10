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
        

    }

    public void detach() {
        // : Implement detach method.
        this.subject.detach(this);
    }
}
