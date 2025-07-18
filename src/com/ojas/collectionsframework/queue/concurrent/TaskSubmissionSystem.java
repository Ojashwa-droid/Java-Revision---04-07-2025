package com.ojas.collectionsframework.queue.concurrent;

import java.util.concurrent.ConcurrentLinkedQueue;


public class TaskSubmissionSystem {
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {

        Thread producer = new Thread(()->{
            while(true){
                try{
                    taskQueue.add("Task " + System.currentTimeMillis());
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread consumer = new Thread(()->{
            while(true){
                try{
                    String task = taskQueue.poll();
                    System.out.println("Processing: " + task);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
