package Prac6.Prototype;

public class Main {
    public static void main(String[] args) {
        Prototype first = new PrototypeOne("First prototype");
        Prototype second = new PrototypeTwo("Second prototype");

        PrototypeOne[] firstPrototypes = {(PrototypeOne) first.clone(), (PrototypeOne) first.clone(), (PrototypeOne) first.clone()};
        PrototypeTwo[] secondPrototypes = {(PrototypeTwo) second.clone(), (PrototypeTwo) second.clone(), (PrototypeTwo) second.clone()};

        for(var it: firstPrototypes) {
            System.out.println(it);
        }

        for(var it: secondPrototypes) {
            System.out.println(it);
        }
    }
}
