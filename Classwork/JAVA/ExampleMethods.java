import java.util.Scanner;

class ExampleMethods{
    public static void main(String [] args){
        ExampleMethods em=new ExampleMethods();
        // int ans=em.add(10,20);
        System.out.print(em.add1());

    }

    public int add(int a, int b){
        return (a+b);
    }

    public int add1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        sc.close();
        return (a+b);
    }
}
