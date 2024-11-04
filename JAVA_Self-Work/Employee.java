public class Employee {

    private int salary;
    private String name;

    public Employee(){} // 0 param constructor.

    public Employee(int salary){ //1 param constructor (Overloading)
        this.salary=salary;
        // System.out.println("Overloading the 0-param constructor.");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name= "Rajat";
        e1.salary=12000;

        Employee e2 = new Employee();
        e2.setName("Sushila");
        e2.salary=13000;

        Employee e3 = new Employee(28000);
        e3.name="Chintan";

        System.out.println(e1.getName()+" "+e1.getSalary());
        System.out.println(e2.getName()+" "+e2.getSalary());
        System.out.println(e3.getName()+" "+e3.getSalary());
    }

    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
