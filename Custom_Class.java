package Com.Company;

class employee1{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My name is " + name);
        System.out.println("My id is " + id);
        System.out.println("My Salary is " + salary);
    }

    public int getSalary(){
        return salary;
    }
}

public class Custom_Class {
    public static void main(String[] args) {

        employee1 aryan = new employee1(); // Instantiating a new employee object
        employee1 shubham = new employee1(); // Instantiating a new employee object

        // Setting Attributesfor Aryan
        aryan.id = 15;
        aryan.salary = 40;
        aryan.name = "Aryan";

        // Setting Attributes for Shubham
        shubham.id = 19;
        shubham.salary = 45;
        shubham.name = "Shubham";

        //Printing the Attributes
        aryan.printdetails();
        shubham.printdetails();
        int salary = shubham.getSalary();
        System.out.println(salary);
        //System.out.println(aryan.id);
        //System.out.println(aryan.name);
    }
}
