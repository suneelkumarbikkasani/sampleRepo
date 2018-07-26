package com.tutorialq.java8;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Inside the run method of the thread1");
        });
        t1.start();
        callChange((a, b) -> a + "mahi" + b);

        ThreadInterface i = (p, s) -> p + " mahi " + s;
        callChange(i);
    }

    public static void callChange(ThreadInterface threadInterface) {
        System.out.println(threadInterface.change("hello world ", "!!!"));
    }

}
