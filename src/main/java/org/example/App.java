package org.example;
/**
 * Vault has a secret number (randomly generated each time the program runs)
 * The thieves must find out the number to open the vault before the police arrives
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Vault vault = new Vault();
        vault.setSecretNumber();
        Thief thief1 = new Thief("Thief 1", 1, 250, vault);
        Thief thief2 = new Thief("Thief 2", 251, 500, vault);
        Thief thief3 = new Thief("Thief 3", 501, 750, vault);
        Thief thief4 = new Thief("Thief 4", 751, 1000, vault);
        Police police = new Police();
        thief1.start();
        thief2.start();
        thief3.start();
        thief4.start();
        police.start();
    }
}
