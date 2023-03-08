package Prac1;

public class Main {
    public static void main(String[] args) {
        Function<Integer> f = (Integer a, Integer b) -> {
            while(a != 0 && b != 0) {
                if (a > b) {
                    a = a % b;
                }
                else {
                    b = b % a;
                }
            }
            return a + b;
        };

        System.out.println(f.GCD(5, 10));
        System.out.println(f.GCD(10, 5));
        System.out.println(f.GCD(4, 6));
        System.out.println(f.GCD(6, 4));
        System.out.println(f.GCD(7, 11));
        System.out.println(f.GCD(11, 7));
    }
}