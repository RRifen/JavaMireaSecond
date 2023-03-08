package Prac5;

public enum Second {
    INSTANCE;

    Second() {
        System.out.println("Second created");
    }


    public Second getInstance() {
        return INSTANCE;
    }
}
