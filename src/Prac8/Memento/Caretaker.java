package Prac8.Memento;

public class Caretaker {
    private int size;
    public Originator.Memento[] mementos;
    Caretaker() {
        mementos = new Originator.Memento[10];
        size = 0;
    }

    public void doSomething(Originator originator) {
        mementos[size] = originator.createMemento();
        size++;
    }

    public Originator.Memento undo() {
        if (size != 0) {
            size--;
            return mementos[size];
        }
        return null;
    }
}
