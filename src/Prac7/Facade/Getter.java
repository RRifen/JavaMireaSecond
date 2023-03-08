package Prac7.Facade;

public class Getter {
    String config;

    public void setConfig(String config) {
        this.config = "|" + config + "|";
    }

    public String getConfig() {
        return config;
    }

}
