package Com.Company;

class MyEmployee{
    private int id;
    private String name;
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

public class Access_Modifiers {
    public static void main(String[] args) {
        MyEmployee aryan = new MyEmployee();
        //aryan.id = 45;
        //aryan.name = "Aryan";-->Throws an error due to private access modifier
        aryan.setname("Shubham");
        System.out.println(aryan.getName());
        aryan.setId(45);
        System.out.println(aryan.getid());
    }
}
