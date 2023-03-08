package Prac6.FactoryMethod;

public class ShipCreator extends Creator{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
