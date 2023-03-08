package Prac6.Builder;

import java.util.Scanner;

public class StandardPCBuilder implements PCBuilder{

    private StandardPC result;
    private final Scanner in = new Scanner(System.in);

    @Override
    public void reset() {
        result = new StandardPC();
    }

    @Override
    public void buildPartSystemUnit() {
        result = new StandardPC();
        System.out.println("Введите содержимое корпуса компьютера (Standard): ");
        result.setSystemUnitInfo(in.nextLine());
    }

    @Override
    public void buildPartMonitor() {
        System.out.println("Введите монитор (Standard): ");
        result.setMonitorInfo(in.nextLine());
    }

    @Override
    public void buildPartPeripherals() {
        System.out.println("Введите периферию (Standard): ");
        result.setPeripheralsInfo(in.nextLine());
    }

    public StandardPC getResult() {
        return result;
    }
}
