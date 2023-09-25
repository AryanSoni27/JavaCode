package Com.Company;

class thread1 extends Thread{
    int i = 0;
    public void run() {
        while (i < 10) {
            System.out.println("Playing Games");
            i++;
        }
    }
}

class thread2 extends Thread{
    int i = 0;
    public void run(){
        while(i<10){
            System.out.println("Chatting with Girlfriend");
            i++;
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}