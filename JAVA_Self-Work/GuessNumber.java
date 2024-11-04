import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int guessTargetNum=ran.nextInt(50)+1;
        // System.out.println("Target value is: "+guessTargetNum); // just to check if it is correctly working.
        int userEnteredNum=0;
        while(userEnteredNum!=guessTargetNum){
            System.out.print("Enter your guess (1-50): "); 
            userEnteredNum=sc.nextInt();
            if(userEnteredNum>guessTargetNum) System.out.println("Target is lower than current.");
            else if (userEnteredNum<guessTargetNum) System.out.println("Target is higher than current.");

        }
        System.out.println("Guessed Correctly.");
        sc.close();
    }
}