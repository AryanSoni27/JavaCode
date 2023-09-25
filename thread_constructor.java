package Com.Company;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("Hello I am a Thread");
//        while (i<10) {
//            System.out.println("Hello I am Thread");
//            i++;
//        }
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Aryan");
        MyThread t2 = new MyThread("Nishil");
        t1.start();
        t2.start();
        System.out.println("Id of the t1 is " + t1.getId());
        System.out.println("Id of the t2 is " + t2.getId());
        System.out.println("Name of the t1 is " + t1.getName());
        System.out.println("Name of the t2 is " + t2.getName());
    }
}
