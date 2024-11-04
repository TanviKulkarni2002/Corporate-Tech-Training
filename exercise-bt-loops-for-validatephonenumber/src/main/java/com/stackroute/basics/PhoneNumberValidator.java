package com.stackroute.basics;
import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //call the functions in the required sequence
        PhoneNumberValidator obj = new PhoneNumberValidator();
        String phoneNumber = obj.getInput();
        int result = obj.validatePhoneNumber(phoneNumber);
        obj.displayResult(result);
        obj.closeScanner();
    }

    public String getInput() {
        System.out.println("Enter the phone number: ");
        String phoneNumber=sc.nextLine();
        return phoneNumber;
    }

    public void displayResult(int result) {
        //displays the result
        System.out.println(result);
    }

    public int validatePhoneNumber(String phoneNumber) {
        short intCount=0;
        if (phoneNumber.equals(null) || phoneNumber.isEmpty()){ //empty string or null condition
            return -1;
        }
        for(int i=0;i<phoneNumber.length();i++){
            char c = phoneNumber.charAt(i);
            if(c=='-'){
                continue;
            }
            else if(Character.isDigit(c)){ //check for digit
                intCount++; //update count
                continue;
            }
            else{
                return 0;
            }
        }

        if(intCount==10){
            return 1;
        }
        return 0;
    }
    public void closeScanner(){
        //close the Scanner object
        sc.close();
    }
}
