package com.hillel.com.hillel.multiThreading;

import java.util.Random;

/**
 * Created by VZhuchkovsky on 18.06.2015.
 */
public class Bankier extends Thread {
    private Bank bank;
    private Random random = new Random();

    public Bankier(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            bank.transaction(randomOperation(), randomAccount());
        }
    }

    private boolean randomOperation() {
        return random.nextBoolean();
    }

    private int randomAccount() {
        return random.nextInt(1000);
    }
}
