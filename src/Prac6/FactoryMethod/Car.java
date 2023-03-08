package Prac6.FactoryMethod;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Car is riding");
    }
}
