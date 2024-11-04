package com.stackroute.commonjavaclasses;

import java.util.Scanner;

public class WrapperClassConvert {

    Scanner sc = new Scanner(System.in);
    String choice;
    {
        System.out.println("Enter the primitive data type: ");
        choice = sc.nextLine();
    }
    public static void main(String[] args) {
        WrapperClassConvert wcc = new WrapperClassConvert();
        Object result=wcc.convertToWrapper(wcc);
        System.out.println("Wrapper class type: "+result);
    }

    // Write logic to determine and convert given primitive type to its wrapper
    // class and return result
    public Object convertToWrapper(Object input) {

        if (choice.equalsIgnoreCase("integer")) {
            System.out.println("Enter the integer value: ");
            input = sc.nextInt();
            Integer obj = Integer.valueOf((int) input);
            System.out.println("Integer object creation successful");
            return (obj.getClass());
        } 
        
        else if (choice.equalsIgnoreCase("boolean")) {
            System.out.println("Enter the boolean value: ");
            input = sc.nextBoolean();
            Boolean obj = Boolean.valueOf((boolean) input);
            System.out.println("Boolean object creation successful");
            return (obj.getClass());
        } 
        
        else if (choice.equalsIgnoreCase("double")) {
            System.out.println("Enter the double value: ");
            input = sc.nextDouble();
            Double obj = Double.valueOf((double) input);
            System.out.println("Double object creation successful");
            return (obj.getClass());
        } 
        
        else if (choice.equalsIgnoreCase("long")) {
            System.out.println("Enter the Long value: ");
            input = sc.nextLong();
            Long obj = Long.valueOf((long) input);
            System.out.println("Long object creation successful");
            return (obj.getClass());
        } 
        
        else if (choice.equalsIgnoreCase("float")) {
            System.out.println("Enter the Float value: ");
            input = sc.nextFloat();
            Float obj = Float.valueOf((float) input);
            System.out.println("Float object creation successful");
            return (obj.getClass());
        } 
        
        else if (choice.equalsIgnoreCase("character")) {
            System.out.println("Enter the Character value: ");
            input = sc.next().charAt(0);
            Character obj = Character.valueOf((char) input);
            System.out.println("Character object creation successful.");
            return (obj.getClass());
        } 
        
        else if (choice.equalsIgnoreCase("short")) {
            System.out.println("Enter the Short value: ");
            input = sc.nextShort();
            Short obj = Short.valueOf((short) input);
            System.out.println("Short object creation successful");
            return (obj.getClass());
        } 
        
        else if (choice.equalsIgnoreCase("byte")) {
            System.out.println("Enter the Byte value: ");
            input = sc.nextByte();
            Byte obj = Byte.valueOf((byte) input);
            System.out.println("Byte object creation successful");
            return (obj.getClass());
        } 
        
        else {
            System.out.println("Incorrect primitive datatype");
            return null;
        }

    }
}