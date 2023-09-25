package Com.Company;

interface cellPhone{
    void calling();
    void receiving();
}

interface musicPlayer{
    void playMusic();
    void stopMusic();
}

class Smartphone implements cellPhone, musicPlayer{
    public void calling(){
        System.out.println("Calling a number");
    }
    public void receiving(){
        System.out.println("Receiving a call");
    }
    public void playMusic(){
        System.out.println("Play a Music");
    }
    public void stopMusic(){
        System.out.println("Stop the music");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        cellPhone c = new Smartphone();
        //only cellphones methods are used to call by this object
        //c.playMusic(); --> Throws an error
        c.calling();
        c.receiving();
    }
}
