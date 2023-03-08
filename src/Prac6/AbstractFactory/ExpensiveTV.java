package Prac6.AbstractFactory;

public class ExpensiveTV implements TV{
    @Override
    public void startUseTV() {
        System.out.println("Start using Expensive TV");
    }
}
