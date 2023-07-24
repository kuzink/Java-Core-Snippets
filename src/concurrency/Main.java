package concurrency;

import java.util.*;

public class Main {

    public static final Object LOCK_1 = new Object();
    public static final Object LOCK_2 = new Object();

    private static void createThreadVariants() throws InterruptedException {
        //1 способ
        MyThread thread_1 = new MyThread();
        thread_1.start();

        //2 способ
        Thread thread_2 = new Thread(() -> System.out.println("2 способ"));
        thread_2.start();

        thread_1.join();
        thread_2.join();
    }

    private static void raceConditionExample() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
            thread.join();
        }
    }

    private static class DeadThreadOne extends Thread {
        public void run() {
            synchronized (LOCK_1) {
                System.out.println("DeadThreadOne захватывает LOCK_1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne пытается захватить Lock_2...");
                synchronized (LOCK_2) {
                    //До сюда выполнение не дойдет
                    System.out.println("Нету deadlock");
                }
            }
        }
    }

    private static class DeadThreadTwo extends Thread {
        public void run() {
            synchronized (LOCK_2) {
                System.out.println("DeadThreadTwo захватывает LOCK_2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne пытается захватить Lock_1...");
                synchronized (LOCK_1) {
                    //До сюда выполнение не дойдет
                    System.out.println("Нету deadlock");
                }
            }
        }
    }

    private static void deadLockExample() throws InterruptedException {
        DeadThreadOne threadOne = new DeadThreadOne();
        DeadThreadTwo threadTwo = new DeadThreadTwo();

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();
    }



    public static void main(String[] args) throws InterruptedException {

        //1. Способы создания потоков:
        //createThreadVariants();

        //2. Пример racecondition
        //raceConditionExample();

        //3. Пример deadlock
        deadLockExample();



        System.out.println("Имя главного потока: " + Thread.currentThread().getName());
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("1 способ");
    }
}

class MyFirstThread extends Thread {
    @Override
    public void run() {
        switch (getName()) {
            case "Thread-0":
                System.out.println("Поток-0 достает яйца из холодильника");
                break;
            case "Thread-1":
                System.out.println("Поток-1 включает плиту");
                break;
            case "Thread-2":
                System.out.println("Поток-2 достает сковородку и ставит на плиту.");
                break;
            case "Thread-3":
                System.out.println("Поток-3 зажигает огонь на плите");
                break;
            case "Thread-4":
                System.out.println("Поток-4 выливает на сковороду масла");
                break;
            case "Thread-5":
                System.out.println("Поток-5 разбивает яйца и выливает их на сковороду");
                break;
            case "Thread-6":
                System.out.println("Поток-6 выбрасывает скорлупу в мусорное ведро");
                break;
            case "Thread-7":
                System.out.println("Поток-7 снимает готовую яичницу с огня");
                break;
            case "Thread-8":
                System.out.println("Поток-8 выкладывает яичницу в тарелку");
                break;
            case "Thread-9":
                System.out.println("Поток-9 моет посуду");
                break;
            default:
                break;
        }
        //System.out.println("I'm Thread! My name is " + getName());
    }
}