package Com.Company;

public class array_practice {
    public static void main(String[] args) {
        //problem 1
        /* int marks[] = {100, 100, 100, 100, 100};
        int sum = 0;
        for(int element : marks){
            sum+=element;
        }
        System.out.println(sum);

        //Problem 2
        int marks[] = {90, 88, 94, 91, 85};
        boolean isInarray = false;
        int num = 99;
        for(int element : marks){
            if(num==element){
                isInarray = true;
                break;
            }
        }
        if(isInarray){
            System.out.println("Element is present in Array");
        }
        else{
            System.out.println("Element is not present in Array");
        }

        //Problem 3
        float[] marks = {90f, 90f, 80f, 75f, 95f};
        int sum = 0;
        for(float element : marks){
            sum+=element;
        }
        float avg = sum/marks.length;
        System.out.println(avg);
        */
        //Practice problem 4
        int[][] mat1 ={{1,2,3},
                       {4,5,6}};
        int[][] mat2 ={{1,2,3},
                       {4,5,6}};
    }

    public static class logical_operator {
        public static void main(String[] args) {
            System.out.println("For Logical AND..");

            boolean a = true;
            boolean b = false;

            if (a && b){
                System.out.println("Yes");
            }
            else{
                System.out.println("False");
            }

            System.out.println("For Logical OR..");

    //        if (a || b){
    //            System.out.println("Yes");
    //        }
    //        else{
    //            System.out.println("No");
    //        }

            System.out.println("Not(a) is " + !a);
            System.out.println("Not(b) is " + !b);
        }
    }
}
