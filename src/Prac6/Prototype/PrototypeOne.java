package Prac6.Prototype;

public class PrototypeOne implements Prototype{

    private String name;

    PrototypeOne(String name) {
        this.name = name;
    }

    PrototypeOne(PrototypeOne toClone) {
        this.name = toClone.name;
    }

    @Override
    public Prototype clone() {
        return new PrototypeOne(this);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getSomeWords() {
        return "Some words";
    }
}
