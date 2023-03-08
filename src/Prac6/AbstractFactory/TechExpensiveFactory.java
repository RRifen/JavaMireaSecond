package Prac6.AbstractFactory;

public class TechExpensiveFactory implements TechFactory{

    @Override
    public Laptop createLaptop() {
        return new ExpensiveLaptop();
    }

    @Override
    public Smartphone createSmartphone() {
        return new ExpensiveSmartphone();
    }

    @Override
    public TV createTV() {
        return new ExpensiveTV();
    }
}
