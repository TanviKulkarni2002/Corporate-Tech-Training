package com.stackroute.unittesting;

import java.util.Scanner;

public class TwinPrimes {
    public static void main(String[] args) {
        new TwinPrimes().inputValidator();
    }

    //write logic to get input from user and send input to findLongestSequence
    public void inputValidator() {
        Scanner scanner = new Scanner(System.in);
        outputPrinter("Enter the Number:");
        String input = scanner.nextLine();
        scanner.close();
        if (!input.isEmpty()) {
            int number = Integer.parseInt(input);
            if (number == 0)
                outputPrinter("Please give proper positive number not zero");
            else if (number < 0)
                outputPrinter("Please give proper positive number not negative");
            else
                outputPrinter(findTwinPrimes(number));
        } else
            outputPrinter("Please give proper input but not null");
    }

    //write logic to find all twin prime numbers less than a given , returns result
    public String findTwinPrimes(int number) {

        String result = "{";
        for (int index = 2; index < number; index++) {
            if (isPrime(index) && isPrime(index + 2)) {
                // to form (number1,number2) type format
                result += "(";
                result += index;
                result += ",";
                result += index + 2;
                result += ")";
                result += ",";
            }
        }
        //remove last ','
        result = result.substring(0, result.length() - 1);
        return result += "}";
    }

    //method to check a number is prime or not
    public boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0)
                return false;
        }
        return true;
    }
    public void outputPrinter(Object printStatement){
        System.out.println(printStatement);
    }
}
