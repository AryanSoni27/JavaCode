package Com.Company;
import java.util.Scanner;
import java.util.Random;
/*
    Create a class Game, Which allows a user to play "Guess The Number" game once.
    Game should have the following method:-
    1.Constructor to generate the random number
    2.takeUserInput() to take a input from a user.
    3.isCorrectNumber() to detect whether the number entered by user is true.
    Use properties such as noOfGuesses(int), etc to get this task done!
*/
class Games {
    private int computerNumber;
    private int numberOfGuesses = 0;
    Scanner sc = new Scanner(System.in);

    Random ran = new Random();

    public int setComputerNumber() {
        computerNumber = ran.nextInt(100);
        return computerNumber;
    }
    public int usernumber(){
        System.out.println("Guess Number between 1-100");
        int userNumber = sc.nextInt();
        return userNumber;
    }
    public void setNumberOfGuesses(){
        numberOfGuesses++;
    }
    public void getNumberOfGuesses(){
        System.out.println(numberOfGuesses);
    }
    public boolean isCorrectNumber(int myNum){
        int flag = 0;
        if(myNum<=100 && myNum>=0) {
            setNumberOfGuesses();
            if (myNum == computerNumber) {
                System.out.println("You have chosen right Number:" + myNum);
                flag = 1;
                sc.close();
            }
            else if (myNum < computerNumber) {
                System.out.println("Your Number is Smaller");
            }
            else if (myNum > computerNumber) {
                System.out.println("Your Number is Greater");
            }
        }
        else{
            System.out.println("Please enter number between 1-100");
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
}

public class ChooseNumber {
    public static void main(String[] args) {

        Games myGame = new Games();
        boolean playGame = true;
        int userNumber;
        int ComputerNumber;
        ComputerNumber = myGame.setComputerNumber();

        while(playGame == true) {
            userNumber = myGame.usernumber();
            boolean mybool = myGame.isCorrectNumber(userNumber);
            if (mybool == true) {
                System.out.print("Guessed in ");
                myGame.getNumberOfGuesses();
                System.out.println(" Guesses");
                playGame = false;
                break;
            } else{
                playGame = true;
            }
        }
    }
}
