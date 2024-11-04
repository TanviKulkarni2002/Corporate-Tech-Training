public class Circle {
    private int radius;
    public static float pi=3.14f;
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3);
        System.out.println("Area: "+c1.calcArea());
        System.out.println("Permimeter: "+c1.calcPerimeter());
        
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public float calcArea(){
        return pi*radius*radius;
    }
    public float calcPerimeter(){
        return 2*pi*radius;
    }
    
}