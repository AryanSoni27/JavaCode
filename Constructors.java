package Com.Company;
class MyMainEmployee{
    public int id;
    public String name;
    public MyMainEmployee(){
        String n;
        int id;
    }
    public void setId(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
    public void setname(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee aryan = new MyMainEmployee();
        aryan.setId(45);
        aryan.setname("Aryan");
        System.out.println(aryan.getid());
        System.out.println(aryan.getName());
    }
}