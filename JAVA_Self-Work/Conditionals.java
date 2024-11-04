import java.util.Scanner;
// public class Conditionals {
//     public static void main(String[] args) {
//         int age=10;
//         if(age>=18){
//             System.out.println("You can vote.");
//         }
//         else{
//             System.out.println("You are underage.");
//         }
//     }
// }

// public class Conditionals {
//     public static void main(String[] args) {
//         byte m1,m2,m3,tot_marks;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter total marks: ");
//         tot_marks=sc.nextByte();
//         System.out.println("Enter marks of 3 subjects: ");
//         m1=sc.nextByte();
//         m2=sc.nextByte();
//         m3=sc.nextByte();
//         sc.close();
//         float totperc= (float)(m1+m2+m3)*100/(3*tot_marks);
//         float temp1=(float)(m1*100/tot_marks);
//         float temp2=(float)(m2*100/tot_marks);
//         float temp3=(float)(m3*100/tot_marks);
//         System.out.println("Total percentage: "+totperc);
//         System.out.println(temp1+" "+temp2+" "+temp3);
//         if(totperc<40 || temp1<33 || temp2<33 || temp3<33){
//             System.out.println("Failed");
//         }
        
//         else{
//             System.out.println("Pass");
//         }
//     }
// }

// public class Conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your salary(in L): ");
//         float salary = sc.nextFloat();
//         sc.close();
//         if(salary<2.5){
//             System.out.println("No Income Tax");
//         }
//         else if (salary>=2.5 && salary<5){
//             System.out.println("Income Tax (5%): "+0.05*salary+"L");
//         }
//         else if(salary>=5 && salary<10){
//             System.out.println("Income Tax(20%): "+0.20*salary+"L");
//         }
//         else{
//             System.out.println("Income Tax(30%): "+0.30*salary+"L");
//         }
//     }
// }

// public class Conditionals {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Entera number (1-7): ");
//             int ch = sc.nextInt();
//             sc.close();
//             switch(ch){
//                 case 1:
//                 System.out.println("Monday");
//                 break;

//                 case 2:
//                 System.out.println("Tuesday");
//                 break;

//                 case 3:
//                 System.out.println("Wednesday");
//                 break;

//                 case 4:
//                 System.out.println("Thursday");
//                 break;

//                 case 5:
//                 System.out.println("Friday");
//                 break;

//                 case 6: 
//                 System.out.println("Staurday");
//                 break;

//                 case 7:
//                 System.out.println("Sunday");
//                 break;
//             }
//         }
//     }

// public class Conditionals {
//             public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the year: ");
//                 int year = sc.nextInt();
//                 sc.close();
//                 if(year%4==0){
//                     System.out.println("Leap Year");
//                 }
//                 else{
//                     System.out.println("Non-Leap Year");
//                 }
//         }
// }

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the extension: ");
        String extension = sc.next();
        sc.close();
        if (extension.equals(".com")){
            System.out.println("Commercial website");
        }
        else if(extension.equals(".org")){
            System.out.println("Organization website");
        }
        else if(extension.equals(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Unknown website extension");
        }

    }
}