package Prac6.Builder;

public class Director {
    private PCBuilder builder;

    public void setBuilder(PCBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartSystemUnit();
        builder.buildPartMonitor();
        builder.buildPartPeripherals();
    }
}
