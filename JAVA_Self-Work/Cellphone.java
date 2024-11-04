public class Cellphone {
    private String modelId;
    public static void main(String[] args) {
        Cellphone c1 = new Cellphone();
        c1.modelId="QBC-123-YN";
        
        System.out.println(c1.modelId);
        c1.ringing();
        c1.vibrating();
        
    }

    public void ringing(){
        System.out.println("Phone ringing...");
    }
    public void vibrating(){
        System.out.println("Phone vibrating...");
    }
}
