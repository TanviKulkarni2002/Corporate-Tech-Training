import java.util.Scanner;

public class SumThreeNums {
    public static void main(String[] args) {
        short a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a=sc.nextShort();
        b=sc.nextShort();
        c=sc.nextShort();
        int sum;
        sum=a+b+c;
        sc.close();
        System.out.println("Sum is= "+sum);
    }
}
