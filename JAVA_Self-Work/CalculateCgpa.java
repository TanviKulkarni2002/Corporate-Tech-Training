import java.util.Scanner;

public class CalculateCgpa {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three subjects' marks: ");
        m1=sc.nextByte();
        m2=sc.nextByte();
        m3=sc.nextByte();
        sc.close();
        float cgpa = (float)(m1+m2+m3)/30;
        System.out.println("CPGA= "+cgpa+"/10");
    }
}
