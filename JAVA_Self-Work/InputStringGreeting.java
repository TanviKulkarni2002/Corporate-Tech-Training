import java.util.Scanner;

public class InputStringGreeting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Hello "+name+". Have a great day ahead!");
        sc.close();
    }
}