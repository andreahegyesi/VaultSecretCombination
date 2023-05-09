package org.example;
public class Police extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("The police will arrive in " + i + " seconds");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Police has caught the thieves");
        System.exit(0);
    }
}
