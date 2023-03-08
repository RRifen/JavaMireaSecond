package Prac3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> lockMap = new LockMap<>();
        Map<Integer, Integer> nonSyncMap = new HashMap<>();

        Thread one = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                nonSyncMap.put(i, 1);
            }
        });

        Thread two = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                nonSyncMap.put(i, 1);
            }
        });

        one.start();
        two.start();
        Thread.sleep(2500);
        System.out.println("NonSync size: " + nonSyncMap.size());

        Thread three = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                lockMap.put(i, 1);
            }
        });

        Thread four = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                lockMap.put(i, 1);
            }
        });

        three.start();
        four.start();
        Thread.sleep(2500);
        System.out.println("Sync size: " + lockMap.size());


    }
}
