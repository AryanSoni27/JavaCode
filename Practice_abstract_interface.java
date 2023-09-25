package Com.Company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");

    }
    void refill(){
        System.out.println("Refill");

    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}

interface BasicAnimal{
    public void eat();
    public void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void Bite(){
        System.out.println("Biting");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating Food");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelePhone extends Telephone{
    void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("Lift The Phone");
    }
    void disconnect(){
        System.out.println("Disconnect the Call");
    }
    void pick(){
        System.out.println("Pickup the call");
    }
}

interface TvRemote{
    void changeChannel();
    void volumeUp();
}

interface SmartTvRemote extends TvRemote{
    void voiceCommand();
}

class TV implements TvRemote{
    public void changeChannel(){
        System.out.println("Changing the Channel");
    }
    public void volumeUp(){
        System.out.println("Increasing Volume");
    }
}
public class Practice_abstract_interface {
    public static void main(String[] args) {
        //Human a = new Human();
        //a.jump();
        //a.Bite();
        //Telephone t = new SmartTelePhone();
        //t.disconnect();
        //t.pick(); --> Throws an error because of polymorphism

        Monkey m = new Human();
        m.Bite();
    }
}
