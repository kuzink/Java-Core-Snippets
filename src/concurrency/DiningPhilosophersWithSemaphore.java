package concurrency;

import java.util.concurrent.Semaphore;

public class DiningPhilosophersWithSemaphore {

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        for (int i = 1; i < 6; i++) {
            new Philosopher(sem, i).start();
        }
    }
}

class Philosopher extends Thread {

    Semaphore sem;
    int id;

    Philosopher(Semaphore sem, int id) {
        this.sem=sem;
        this.id=id;
    }

    public void run() {
        try {
            sem.acquire();
            System.out.println ("Философ " + id + " садится за стол");
            // философ ест
            Thread.sleep(500);

            System.out.println ("Философ " + id + " выходит из-за стола");
            sem.release();

            // философ гуляет
            Thread.sleep(500);
        } catch(InterruptedException e) {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}