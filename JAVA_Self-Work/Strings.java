// import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String s = "ABC";
        // System.out.println(s);
        // s.concat("XYZ"); // Copy of s given, s will not update
        // System.out.println(s);
        // s=s.concat("XYZ"); //Updating whole variable
        // System.out.println(s);
        // String s0 = "  ABC  ";
        // String s1 = "ABCC12345";
        // String s2= "abc";

        // System.out.println("Length of string: "+s.length());
        // System.out.println("Lower Case string: "+s.toLowerCase());
        // System.out.println("Upper Case string: "+s.toUpperCase());
        // System.out.println("Removed white-spaces of string: "+s0.trim());
        // System.out.println("String from given index to end of string: "+s1.substring(2));
        // System.out.println("String from given start and end index: "+s1.substring(2,6));
        // System.out.println("Replacing 5 with 6: "+s1.replace('5','6'));
        // System.out.println("Immutability of strings: "+s+" "+s0+" "+s1);
        // System.out.println("Starts with function: "+s.startsWith("A")); //return boolean value
        // System.out.println("Ends with function: "+s1.endsWith("56")); //returns boolean value
        // System.out.println("Charcter at given index: "+s0.charAt(4));
        // System.out.println("Index of given character (returns only for first spotted): "+s1.indexOf("C")); //also works with strings
        // System.out.println("Index of given character searched from mentioned index (returns only for first spotted): "+s1.indexOf("C",1)); //also works with strings
        // System.out.println("Last Spotted Index of entered value: "+s1.lastIndexOf("C")); // returns the last spotted index, also works with strings
        // System.out.println("Last Spotted Index of entered value: "+s1.lastIndexOf("C",7)); // returns the last spotted index till entered index, also works with strings
        // System.out.println(s.equals(s0.trim())); //use .equals() to compare strings instead of '=='
        // System.out.println(s.equalsIgnoreCase(s2)); //ignores upper and lower case differences while comparing
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your string: ");
        // String s3 = sc.nextLine();
        // sc.close();
        // System.out.println("Lower-Cased: "+s.toLowerCase());
        // System.out.println("Lower-Cased: "+s3.replace(" ","_"));
        // String template = "Hello <name>! Thanks a lot!";
        // System.out.println(template.replace("<name>",s3));
        // System.out.println("Double spaces index: "+s3.indexOf("  "));
        // System.out.println("Triple spaces index: "+s3.indexOf("   "));
        
        // String newString = "Dear Friends,\n\tHave fun on the journey!\n\tSee you soon."; //\n and \t, usage
        // System.out.println(newString);
    }
}

/*Strings are immutable. Once declared cannot be changed.
 * Thus, code after executing line 5 still prints value of s as ABC.
 * But after executing line 7, we see output as ABCXYZ.
 * This is because, JVM creates another object (updating the variable entirely), and gives that object's reference to s.
 * The new object created has the value ABCXYZ.
 * When you write s0=s0.trim()=> Here the whole variable s0 is getting updated, not that the string is changing.
 */