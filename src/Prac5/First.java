package Prac5;

public class First {
    // Ленивая инициализация
    private static First instance;

    private First() {

    }

    public static synchronized First getInstance() {
        if (instance == null) {
            instance = new First();
            System.out.println("First created");
        }
        return instance;
    }

}
