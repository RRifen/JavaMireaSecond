package Prac6.Builder;

public class MicroATXPC implements PC{

    public void setSystemUnitInfo(String systemUnitInfo) {
        this.systemUnitInfo = systemUnitInfo;
    }

    public void setMonitorInfo(String monitorInfo) {
        this.monitorInfo = monitorInfo;
    }

    public void setPeripheralsInfo(String peripheralsInfo) {
        this.peripheralsInfo = peripheralsInfo;
    }
    private String systemUnitInfo;
    private String monitorInfo;
    private String peripheralsInfo;

    @Override
    public String getConfig() {
        String info = "This is a Micro ATX PC\n";
        info += "System Unit config: " + systemUnitInfo + "\n";
        info += "Monitor config: " + monitorInfo + "\n";
        info += "Peripherals config: " + peripheralsInfo + "\n";
        return info;
    }

}
