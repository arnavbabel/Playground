import java.util.Scanner;
import java.util.Random;

public class Sandbox {
    public static void main(String[] args) {
        // comparing random numbers
        compareRandomNums();
    }

    // comparing random numbers
    public static void compareRandomNums() {
        // declare variables
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        // get user input
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scnr.nextInt();

        // validate input
        if (userInput < 1 || userInput > 10) {
            System.out.println("Error: Number out of range.");
        }

        // generate random number and compare
        int randomNum = rand.nextInt(10) + 1;
        if (userInput == randomNum) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose! The number was " + randomNum);
        }
    }
}