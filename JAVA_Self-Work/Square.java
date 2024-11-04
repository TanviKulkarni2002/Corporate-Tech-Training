// public class Square {
//     private int side;
//     public static void main(String[] args) {

//         Square s1 = new Square();
//         s1.setSide(10);
//         System.out.println("Area: "+s1.calcArea());
//         System.out.println("Permiter: "+s1.calcPerimeter());
        
//     }

//     public void setSide(int side){
//         this.side=side;
//     }
//     public int calcPerimeter(){
//         return 4*side;
//     }
//     public int calcArea(){
//         return side*side;
//     }

// }

//Rectangle- special type of square
public class Square {
    private int length;
    private int breadth;
    public static void main(String[] args) {

        Square s1 = new Square();
        s1.setSides(10,20);
        System.out.println("Area: "+s1.calcArea());
        System.out.println("Permiter: "+s1.calcPerimeter());
        
    }

    public void setSides(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int calcPerimeter(){
        return 2*(length+breadth);
    }
    public int calcArea(){
        return length*breadth;
    }

}