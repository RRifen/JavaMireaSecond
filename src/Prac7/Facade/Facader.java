package Prac7.Facade;

public class Facader {

    private final Getter getter = new Getter();
    private final Worker worker = new Worker();
    private final Printer printer = new Printer();

    public void doWork(String message) {
        getter.setConfig(message);
        printer.print(worker.reBuild(getter.getConfig()));
    }
}
