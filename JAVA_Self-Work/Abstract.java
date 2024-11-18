public class Abstract {
    public static void main(String[] args) {
        Squares sq = new Squares();
        System.out.println("Square area: "+sq.area());

        Circles c = new Circles();
        System.out.println("Circle area: "+c.area());
    }
}

abstract class Shapes{
    abstract double area();
}

class Squares extends Shapes{
    double side=3.0d;

    @Override
    double area() {
        return side*side;
    } 
}

class Circles extends Shapes{
    double radius=3.0d;
    
    @Override
    double area() {
        return Math.PI*radius*radius;
    } 
}