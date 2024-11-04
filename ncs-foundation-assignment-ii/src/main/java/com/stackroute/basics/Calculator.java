package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        System.out.println("Enter the first number: ");
        int firstValue = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondValue = scan.nextInt();
        System.out.println("MENU\n 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide");
        System.out.println("Enter your choice: ");
        int operator = scan.nextInt();
        if (operator<1 || operator>4){
            System.out.println("Invalid Operator");
        }
        else{
            String ans = calculate(firstValue,secondValue,operator);
            System.out.println(ans);
        }
        System.out.println("Do you want to calculate again? (y)");
        char choice = scan.next().charAt(0);
        if (choice=='y'){
            getValues(scan);
        }
        scan.close();
    }

//     //perform operation based on the chosen switch case corresponding to the menu and return string
//     //Switch Case
//     public String calculate(int firstValue, int secondValue, int operator) {
//         String ans="";
//         switch(operator){
//             case 1:
//                 ans="Addition="+(firstValue+secondValue);
//                 break;
//             case 2:
//                 ans="Subtraction="+(firstValue-secondValue);
//                 break;
//             case 3:
//                 ans="Multiplication="+(firstValue*secondValue);
//                 break;
//             case 4:
//                 if (secondValue!=0){
//                     ans="Division="+((float) firstValue/secondValue);
//                 }
//                 else{
//                     ans="Division by 0 is Undefined";
//                 }
//         }
//         return ans;
//     }
// }

   //perform operation based on the chosen switch case corresponding to the menu and return string
    //I-else
    public String calculate(int firstValue, int secondValue, int operator) {
        String ans="";
            if (operator==1){
                ans="Addition="+(firstValue+secondValue);
            }
            if (operator==2){
                ans="Subtraction="+(firstValue-secondValue);
            }
            if(operator==3){
                ans="Multiplication="+(firstValue*secondValue);
            }
            if(operator==4){
                if (secondValue!=0){
                    ans="Division="+((float) firstValue/secondValue);
                }
                else{
                    ans="Division by 0 is Undefined";
                }
            }
        return ans;
    }
}
