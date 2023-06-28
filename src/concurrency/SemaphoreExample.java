package concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) throws InterruptedException {

        Semaphore sem = new Semaphore(1); // 1 разрешение
        CommonResource res = new CommonResource();

        new Thread(new CountThread(res, sem, "CountThread 1")).start();
        new Thread(new CountThread(res, sem, "CountThread 2")).start();
        new Thread(new CountThread(res, sem, "CountThread 3")).start();

        Thread.sleep(1500);
        System.out.println("Итого: " + res.x);
    }
}

class CommonResource{
    long x = 0;
}

class CountThread implements Runnable{

    CommonResource res;
    Semaphore sem;
    String name;

    CountThread(CommonResource res, Semaphore sem, String name){
        this.res=res;
        this.sem=sem;
        this.name=name;
    }

    public void run(){
        try{
            System.out.println(name + " ожидает разрешение");
            sem.acquire();
            for (int i = 0; i < 4; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(name + " освобождает разрешение");
        sem.release();
    }
}