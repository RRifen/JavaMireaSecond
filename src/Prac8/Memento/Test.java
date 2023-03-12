package Prac8.Memento;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator("First");
        Originator originator2 = new Originator("ONE");


        Caretaker caretaker = new Caretaker();
        Caretaker caretaker2 = new Caretaker();
        caretaker.doSomething(originator);
        caretaker2.doSomething(originator2);
        originator.setState("Second");
        originator2.setState("ONEONE");
        caretaker.doSomething(originator);
        caretaker2.doSomething(originator2);
        originator.setState("Three");
        originator2.setState("ONEONEONE");
        caretaker.doSomething(originator);
        caretaker2.doSomething(originator2);

        originator.setMemento(caretaker.undo());
        System.out.println(originator);
        originator.setMemento(caretaker.undo());
        System.out.println(originator);
        originator.setMemento(caretaker.undo());
        System.out.println(originator);
    }
}
