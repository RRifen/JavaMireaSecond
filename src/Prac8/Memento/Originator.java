package Prac8.Memento;

public class Originator {
    public Originator(String state) {
        this.state = state;
    }
    private String state;
    public void setMemento(Memento m) {
        state = m.state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state;
    }


    public class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }
    }
}
