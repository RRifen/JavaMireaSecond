package Prac4;

import java.util.concurrent.RejectedExecutionException;

public class Main {
    public static void main(String[] args) {
        MyExecutorService execService = new MyExecutorService(3);
        execService.submit(() -> {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Конец первого действия");
        });
        execService.shutdown();

        try {
            execService.submit(() -> {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Конец второго действия");
            });
        } catch (RejectedExecutionException e) {
            System.out.println("Отмена второго действия");
        }

        System.out.println("Shutdown: " + execService.isShutdown());
        System.out.println("Terminated: " + execService.isTerminated());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Terminated: " + execService.isTerminated());
    }
}
