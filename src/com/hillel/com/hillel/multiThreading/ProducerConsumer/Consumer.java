package com.hillel.com.hillel.multiThreading.ProducerConsumer;

/**
 * Created by VZhuchkovsky on 22.06.2015.
 */
public class Consumer extends Thread{
    private Bucket bucket;

    public Consumer(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            bucket.get();
        }
    }
}
