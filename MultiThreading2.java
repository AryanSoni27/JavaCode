package Com.Company;

class RunnableThread1 implements Runnable{
    int i = 0;
    public void run() {
        while (i < 10) {
            System.out.println("Thread 1 is Running");
            i++;
        }
    }
}

class RunnableThread2 implements Runnable{
    int i = 0;
    public void run() {
        while (i < 10) {
            System.out.println("Thread 2 is Running");
            i++;
        }
    }
}

public class MultiThreading2 {
    public static void main(String[] args) {
        RunnableThread1 t1 = new RunnableThread1();
        Thread gun1 = new Thread(t1);

        RunnableThread2 t2 = new RunnableThread2();
        Thread gun2 = new Thread(t2);

        gun1.start();
        gun2.start();
    }
}
