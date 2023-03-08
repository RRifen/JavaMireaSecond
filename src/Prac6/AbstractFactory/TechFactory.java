package Prac6.AbstractFactory;

public interface TechFactory {
    Laptop createLaptop();
    Smartphone createSmartphone();
    TV createTV();
}
