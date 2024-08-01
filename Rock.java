import java.util.Random;
import java.util.Scanner;

public class Rock {

  public static void main(String[] args) {
    //  rock = 0;
    //  paper = 1;
    //  scissor = 2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to our game please Enter your Choice : ");
    int userInput = sc.nextInt();
    Random rnd = new Random();
    int computerInput = rnd.nextInt(3); 

    if (userInput == 0){
        System.out.println("User's Choice is rock ");
     }
    if (userInput == 1) {
        System.out.println("User's Choice is Paper");
    } 
    if (userInput == 2) {
        System.out.println("User's Choice is Scissors");
    }
     

    if (computerInput == userInput) {
        System.out.println("Draw or no one wins or no one lose ");
    } else if (computerInput == 0 && userInput == 1 || computerInput == 1 && userInput == 2 || computerInput == 2 && userInput == 0) {
          System.out.println("User Wins ");
    }
    else {
        System.out.println("Computer Wins ");
    }
    System.out.println("Computer Choice is : " + computerInput);
    if (computerInput == 0) {
        System.out.println("Computer choice is Rock  ");
    } else if (computerInput == 1) {
        System.out.println("Computer choice is paper ");
    } else {
        System.out.println("Computer choice is Scissors ");
    }
  }    
}