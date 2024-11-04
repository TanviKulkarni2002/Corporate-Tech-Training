public class ExampleConstructor {
    public static void main(String[] args) {
        Beta b = new Beta(); //Call to the 0-parameterized constructor
        Beta b2 =  new Beta(3); //Call to the user-defined constructor
        System.out.println(b);
        System.out.println(b2);

    }
}

class Beta{
    Beta(){ //Default or 0-parameterized constuctor
        System.out.println("This is a 0-parameterized constructor");
    }

    Beta(int a){ //User-defined constructor
        System.out.println("This is a user-defined constructor");
    }
}