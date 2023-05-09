package org.example;
public class Thief extends Thread {
    Vault vault;
    private String name;
    private int min;
    private int max;
    private int proposedNumber;

    public Thief(String name, int min, int max, Vault vault) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.vault = vault;
    }

    public int getProposedNumber() {
        return proposedNumber;
    }

    @Override
    public void run() {
        for (int i = min; i < max; i++) {
            proposedNumber = i;
            System.out.println("Thief " + this.name + " tries with number " + proposedNumber);
            if (vault.open(proposedNumber)) {
                System.out.println("The thief " + this.name + " found out the secret number " + proposedNumber);
                System.exit(0);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



