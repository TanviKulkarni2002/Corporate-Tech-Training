//Inheritance basics
public class SmartPhones {

    protected float price;
    public static void main(String[] args) {

        Phone p= new Phone();
        p.modelAge(12); // calling child class method
        p.modelName("Nokia"); // calling psarent class method: inherited
        p.price=1000.99f; // setting value for inherited field
        System.out.println(p.price);
    }
    public void modelName(String name){
        System.out.println("I am the parent class method, name: "+name);
    }

    //Overloading
    public void modelName(String name,int x){
        System.out.println("I am the parent class method, name: "+name+"x: "+x);
    }
}

class Phone extends SmartPhones{

    public void modelAge(int yearsOld){
        System.out.println("I am the child class method, x:"+yearsOld);
    }

    @Override
    public void modelName(String name){
        super.modelName(name);
        // System.out.println("I am the child class method, name:"+name);
    }
}
