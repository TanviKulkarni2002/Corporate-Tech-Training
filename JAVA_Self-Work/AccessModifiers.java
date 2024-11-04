public class AccessModifiers{
    private int radius;
    private int height;

    public static void main(String[] args) {
        AccessModifiers cylinder = new AccessModifiers(10,10);
        // cylinder.setRadius(12);
        // cylinder.setHeight(10);
        // System.out.print("Entered radius is: ");
        // System.out.println(cylinder.getRadius());
        // System.out.print("Entered height is: ");
        // System.out.println(cylinder.getHeight());

        System.out.println("SA: "+cylinder.calcSA());
        System.out.println("Volume: "+cylinder.calcVol());
    }

    public AccessModifiers(){
        radius=12;
        height=10;
    }

    //Overloaded access-modifier constructor
    public AccessModifiers(int radius,int height){
        this.radius=radius;
        this.height=height;
    }

    // public int getRadius() {
    //     return radius;
    // }

    // public int getHeight() {
    //     return height;
    // }

    // public void setHeight(int height) {
    //     this.height = height;
    // }

    // public void setRadius(int radius) {
    //     this.radius = radius;
    // }
    
    public double calcSA(){
        return 2*(3.14*radius)*height;
    }

    public double calcVol(){
        return (3.14*radius*radius)*height;
    }
}