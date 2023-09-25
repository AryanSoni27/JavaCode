package Com.Company;

class myThr extends Thread{
    public myThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 10;
        System.out.println("Hello How are You?" + getName());
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        myThr t1 = new myThr("Aryan1(Minimum Priority)");
        myThr t2 = new myThr("Aryan2");
        myThr t3 = new myThr("Aryan3");
        myThr t4 = new myThr("Aryan4(Most Important)");
        myThr t5 = new myThr("Aryan5");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
