package Prac6.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Creator crCar = new CarCreator();
        Creator crShip = new ShipCreator();

        Transport trCar = crCar.createTransport();
        Transport trShip = crShip.createTransport();

        trCar.move();
        trShip.move();
    }
}
