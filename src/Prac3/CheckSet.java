package Prac3;

import java.util.HashSet;
import java.util.Set;

public class CheckSet {
    public static void main(String[] args) throws Exception {
        Set<Integer> syncSet = new SynchronizedSet<>();
        Set<Integer> nonSyncSet = new HashSet<>();

        Thread one = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                nonSyncSet.add(i);
            }
        });

        Thread two = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                nonSyncSet.add(i);
            }
        });

        one.start();
        two.start();
        Thread.sleep(2000);
        System.out.println("Non sync size: " + nonSyncSet.size());

        Thread three = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                syncSet.add(i);
            }
        });

        Thread four = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                syncSet.add(i);
            }
        });

        three.start();
        four.start();
        Thread.sleep(2000);
        System.out.println("Sync size: " + syncSet.size());

    }
}
