package Prac6.Builder;

import java.util.Scanner;

public class MicroATXPCBuilder implements PCBuilder{

    private MicroATXPC result;
    private final Scanner in = new Scanner(System.in);

    @Override
    public void reset() {
        result = new MicroATXPC();
    }

    @Override
    public void buildPartSystemUnit() {
        result = new MicroATXPC();
        System.out.println("Введите содержимое корпуса компьютера (Micro ATX): ");
        result.setSystemUnitInfo(in.nextLine());
    }

    @Override
    public void buildPartMonitor() {
        System.out.println("Введите монитор (Micro ATX): ");
        result.setMonitorInfo(in.nextLine());
    }

    @Override
    public void buildPartPeripherals() {
        System.out.println("Введите периферию (Micro ATX): ");
        result.setPeripheralsInfo(in.nextLine());
    }

    public MicroATXPC getResult() {
        return result;
    }
}
