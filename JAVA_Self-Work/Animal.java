public class Animal {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.sound();

        Animal a2 = new Dog();
        a2.sound();

        Dog d = new Dog();
        d.sound();

        // Dog d = new Animal(); // This is cannot done
    }

    public void sound(){
        System.out.println("Sounds...");
    }
}

class Dog extends Animal{
    //Overriding the parent class method in child class
    @Override
    public void sound(){
        System.out.println("Woof.. Woof...");
    }
}