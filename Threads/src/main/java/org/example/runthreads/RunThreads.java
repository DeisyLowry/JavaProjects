package org.example.runthreads;

public class RunThreads extends Thread{


    public static void main(String[] args) {
        RunThreads thread = new RunThreads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}