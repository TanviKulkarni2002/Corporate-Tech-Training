import java.util.Scanner;

public class Arrays_1D {
    Scanner sc = new Scanner(System.in);
    private int size;
    {
        System.out.println("Enter array size: ");
        size=sc.nextInt();
    }
        
    private int [] arr = new int [size]; //array object declaration 

    public static void main(String[] args) { 
        Arrays_1D arr1 = new Arrays_1D();
        arr1.getValues();
        arr1.closeScanner();
        arr1.displayValues();
    }

    private void getValues(){
        for(int i=0;i<size;i++){
            System.out.println("Enter integer value: ");
            arr[i]=sc.nextInt();
        }
    }

    private void displayValues(){
        for(int i=0;i<size;i++){
            System.out.println("integer value at location "+i+" is "+arr[i]);
        }
        System.out.println("Length of the array is: "+arr.length);
        
        //For each loop, aka, enhanced for loop
        // for(int a : arr){
        //     System.out.println(a);
        // }
    }

    private void closeScanner(){
        sc.close();
    }
}
/*Arrays are static, you need to give a size while declaring it, once declared you can't resize them during code 
 * execution, they have very fast element reading capabilities because of indexed-access, all elements 
 * will have same declared datatype.
 * Array declared as an object can store data of multiple datatypes. Only objects have that talent.*/