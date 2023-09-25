package Com.Company;

interface camera{
    void snap();
    void recordVideo();
    private void takepicture(){
        System.out.println("Taking Picture");
    }//Private method in interface is not accesible by any other class,
    //It is created if the logic of default method is big enough then we can
    //use private method in default method
    default void record4kVideo(){
        takepicture();
        System.out.println("Recording in 4k");
    }
}

interface GPS{
    void location();
    void currentLocation();
}

interface WiFi{
    String[] getNetwork();
    void ConnectToNetwork(String network);
}

class MyCellPhone{
    void CallNumber(int phonenumber){
        System.out.println("Calling a "+phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting");
    }
}

class Mysmartphone extends MyCellPhone implements camera,GPS,WiFi {
    public void snap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public void location(){
        System.out.println("Sending Location");
    }
    public void currentLocation(){
        System.out.println("Getting Location");
    }
    public String[] getNetwork(){
        System.out.println("Getting a Network");
        return new String[0];
    }

    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("Connecting to:"+network);
    }

    public void callNumber(int phonenumber){
        System.out.println("Calling a number"+phonenumber);
    }
    public void pickcall(){
        System.out.println("Connecting");
    }

//    public void record4kVideo(){
//        System.out.println("Taking Snap and recording 4k video");
//    }// it overrides if we want to override
}

public class interfaces2 {
    public static void main(String[] args) {
        Mysmartphone a = new Mysmartphone();
//          a.currentLocation();
//          a.recordVideo();
//          a.getNetwork();
            a.ConnectToNetwork("Aryan");
            a.callNumber(63511782);
            a.record4kVideo();
            //a.takepicture(); --> Throws an error because takepicture is private method
    }
}
