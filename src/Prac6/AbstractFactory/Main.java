package Prac6.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        TechFactory[] factories = {new TechCheapFactory(), new TechExpensiveFactory()};

        Laptop[] laptops = {factories[0].createLaptop(), factories[1].createLaptop()};
        Smartphone[] smartphones = {factories[0].createSmartphone(), factories[1].createSmartphone()};
        TV[] tvs = {factories[0].createTV(), factories[1].createTV()};

        for(Laptop it: laptops) {
            it.startUseLaptop();
        }

        for(Smartphone it: smartphones) {
            it.startUseSmartphone();
        }

        for(TV it: tvs) {
            it.startUseTV();
        }
    }
}
