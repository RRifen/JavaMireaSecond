package Prac6.FactoryMethod;

public class CarCreator extends Creator {

    @Override
    Transport createTransport() {
        return new Car();
    }
}
