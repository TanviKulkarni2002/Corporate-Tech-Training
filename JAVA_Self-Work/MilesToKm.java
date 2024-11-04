import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short miles;
        System.out.println("Enter the distance in miles: ");
        miles=sc.nextShort();
        sc.close();
        float kms = (float)1.6*miles;
        System.out.println("Distance in Kms: "+kms);
    }
}
