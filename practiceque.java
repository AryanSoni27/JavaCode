package Com.Company;

public class practiceque {
    public static void main(String[] args) {
        int flats[] = {10, 50, 601, 54, 89};
        float num = 60;
        boolean isInarray = false;
        for (int element:flats ){
            if(num==element){
                isInarray = true;
                break;
            }
        }
        if(isInarray){
            System.out.println("Element is present in array");
        }
        else{
            System.out.println("Element is not present in array");
        }
    }
}
