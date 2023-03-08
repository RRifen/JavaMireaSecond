package Prac6.AbstractFactory;

public class TechCheapFactory implements TechFactory {

    @Override
    public Laptop createLaptop() {
        return new CheapLaptop();
    }

    @Override
    public Smartphone createSmartphone() {
        return new CheapSmartphone();
    }

    @Override
    public TV createTV() {
        return new CheapTV();
    }
}
