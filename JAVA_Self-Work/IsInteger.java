import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()){
            System.err.println("Yes, this is an inetger.");
        }
        else{
            System.err.println("Not an integer.");
        }
        sc.close();
    }
}
