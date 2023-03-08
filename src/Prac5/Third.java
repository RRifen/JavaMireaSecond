package Prac5;

public class Third {
    private static final Third instance = new Third();

    private Third() {
        System.out.println("Third created");
    }
    public static Third getInstance() {
        return instance;
    }
}
