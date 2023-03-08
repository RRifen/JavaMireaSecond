package Prac6.FactoryMethod;

public class Ship implements Transport {
    @Override
    public void move() {
        System.out.println("Ship is sailing");
    }
}
