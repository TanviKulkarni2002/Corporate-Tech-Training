/*You can create the reference of interfaces, but not an object directly.
* You can use interfaces by implementing it in another concrete class and creating
* the object of that concrete class or by type-casting the object of a concrete class with
* that interface.*/

public class Interfaces {
    public static void main(String[] args) {
        
        Vehicle mercedes = new Car();
        mercedes.start();
        mercedes.stop();

        Cycle heroCycle = new Cycle();
        heroCycle.start();
        heroCycle.stop();
    }
}

interface Vehicle{
    void start();

    // Default and private methods can be created in interfaces: not public or protected
    default void stop(){
        System.out.println("Stop operation completed.");
    }
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting. Engine running.");
    }
}

class Cycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Cycle peddles are ready. Begin when you're ready.");
    }
}