package Com.Company;
class phone{
    public void on(){
        System.out.println("Turning On Phone");
    }
    public void showtime(){
        System.out.println("Time is 8 AM");
    }
}

class smartphone extends phone{
    public void on(){
        System.out.println("turning On SmartPhone");
    }
    public void playmusic(){
        System.out.println("Playing Music...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // phone ar = new phone(); // Allowed
        // smartphone sm = new smartphone(); // Allowed
        // ar.greet();

        phone obj = new smartphone(); //-->Yes It is Allowed
        //smartphone obj2 = new phone(); -->Not Allowed

        obj.on();
        obj.showtime();
        //obj.playmusic(); -->Not Allowed
    }
}
