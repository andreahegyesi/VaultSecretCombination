package org.example;
import java.util.Random;
public class Vault {
    private int secretNumber;

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(1000) + 1;
        System.out.println("Secret number: " + getSecretNumber());
    }

    public boolean open(int tryNumber) {
        if (tryNumber == getSecretNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
