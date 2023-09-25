package Com.Company;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
        public static final String Rock = "R";
        public static final String Paper = "P";
        public static final String Scissor = "S";

        //get the game result

        public static void  getresult(String usersMove, String computersMove){
            System.out.println("Computer's Move is: " + computersMove);

            if(usersMove.equals(computersMove))
                System.out.println("It's a Tie");

            else if (usersMove.equals(Rock)) {
                if(computersMove.equals(Scissor))
                    System.out.println("You win!! Rock crushes Scissor");
                else if (computersMove.equals(Paper))
                    System.out.println("You lose!! Paper covers Rock");
            }

            else if(usersMove.equals(Paper)){
                if (computersMove.equals(Rock))
                    System.out.println("You win!! Paper covers Rock");
                else if(computersMove.equals(Scissor))
                    System.out.println("You lose!! Scissor cut Paper");
            }

            else if(usersMove.equals(Scissor)){
                if (computersMove.equals(Paper))
                    System.out.println("You win!! Scissor cuts Paper");
                else if(computersMove.equals(Rock))
                    System.out.println("You lose!! Rock crushes Scissor");
            }
        }

    //Get computers move

    public static String getComputersMove(){
            int computersnum;
            String computersMove = "";
            Random rand = new Random();
            computersnum = rand.nextInt(3);
            if(computersnum == 1)
                computersMove = Rock;
            else if(computersnum == 2)
                computersMove = Paper;
            else if (computersnum == 3)
                computersMove = Scissor;
            return computersMove;
    }

    //Get Users Move

    public static String getUsersMove(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your play: ");
        String input = sc.next().toUpperCase();
        return input;
    }

    // Main Method

    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissor!");
        System.out.println("Rock = R, Paper = P, Scissor = S");
        String userInput = getUsersMove();
        if (userInput.equals(Rock) || userInput.equals(Paper) || userInput.equals(Scissor))
            getresult(userInput,getComputersMove());
        else
            System.out.println("Invalid Input" + userInput);
    }
}
