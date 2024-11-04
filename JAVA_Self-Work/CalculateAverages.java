import java.util.Scanner;

public class CalculateAverages {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks of each exam: ");
        byte tot_marks=sc.nextByte();
        byte m1,m2,m3,m4,m5;
        float percentage;
        System.out.println("Enter sub1 marks: ");
        m1=sc.nextByte();
        System.out.println("Enter sub2 marks: ");
        m2=sc.nextByte();
        System.out.println("Enter sub3 marks: ");
        m3=sc.nextByte();
        System.out.println("Enter sub4 marks: ");
        m4=sc.nextByte();
        System.out.println("Enter sub5 marks: ");
        m5=sc.nextByte();

        float sum = m1+m2+m3+m4+m5;
        percentage=(sum*100)/(5*tot_marks);
        System.out.println("Percentage earned= "+percentage+"%");
        sc.close();
    }
}
