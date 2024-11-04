package com.stackroute.basics;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
		double length = sc.nextDouble();
        System.out.println("Enter breadth: ");
		double breadth = sc.nextDouble();
        sc.close();
        if(length<=0 || breadth<=0){
            System.out.println("Incorrect Values");
        }
        else{
            perimeterCalculator(length, breadth);
        }

    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        System.out.println("Perimeter of rectangle: "+2*(length+breadth));
        return 0;
    }
}
