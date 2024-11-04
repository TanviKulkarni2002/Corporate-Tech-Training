//Local Chaining without Super-call
// public class LocalChainingExample {
//     public static void main(String[] args) {
//         LocalChainingExample e1=new LocalChainingExample();
//         System.out.println(e1);
//     }
//     public LocalChainingExample(){
//         this(5); //Calling next 1 parameter constructor using 'this'
//         System.out.println("0 parameter");
//     }
//     public LocalChainingExample(int a){
//         this(2,3); //Calling next 2 parameter constructor using 'this'
//         System.out.println("1 parameter");
//     }
//     public LocalChainingExample(int a,int b){
//         System.out.println("2 parameter");
//     }
// }

//Local Chaining with Super-call
public class LocalChainingExample extends Sample {
    public static void main(String[] args) {
        LocalChainingExample e1=new LocalChainingExample();
        System.out.println(e1);
    }
    public LocalChainingExample(){
        this(5); //Calling next 1 parameter constructor using 'this'
        System.out.println("0 parameter");
    }
    public LocalChainingExample(int a){
        this(2,3); //Calling next 2 parameter constructor using 'this'
        System.out.println("1 parameter");
    }
    public LocalChainingExample(int a,int b){
        super(4); //Calling sameple class 1 parameter constructor using 'super' keyword.
        System.out.println("2 parameter");
    }
}

class Sample{

    public Sample(){
        System.out.println("This is sample class constructor.");   
    }
    public Sample(int a){
        System.out.println("This is sample class constructor: 1 parameter.");   
    }
}