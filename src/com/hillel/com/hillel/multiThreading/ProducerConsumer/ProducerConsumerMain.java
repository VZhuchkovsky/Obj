package com.hillel.com.hillel.multiThreading.ProducerConsumer;

/**
 * Created by VZhuchkovsky on 22.06.2015.
 */
public class ProducerConsumerMain {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();

        Producer producer = new Producer(bucket);
        Consumer consumer = new Consumer(bucket);

        producer.start();
        consumer.start();

        try {
            Thread.currentThread().sleep(10);
        } catch (InterruptedException e) {}

        producer.interrupt();
        consumer.interrupt();

        try {
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bucket);
    }
}
