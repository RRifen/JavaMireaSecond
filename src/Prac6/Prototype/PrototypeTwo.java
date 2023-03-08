package Prac6.Prototype;

public class PrototypeTwo implements Prototype {
    private String secondName;

    PrototypeTwo(String secondName) {
        this.secondName = secondName;
    }

    PrototypeTwo(PrototypeTwo toClone) {
        this.secondName = toClone.secondName;
    }

    @Override
    public Prototype clone() {
        return new PrototypeTwo(this);
    }

    @Override
    public String toString() {
        return secondName;
    }
}
