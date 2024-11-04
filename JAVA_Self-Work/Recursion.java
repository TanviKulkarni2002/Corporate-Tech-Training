public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.fact(4)); // iterative way call
        System.out.println(r.fact_(4)); // recursive call
        r.fibonacci(5); // iterative way call
        System.out.println();
        r.printFibSeq(5); // recursive call
    }

    public int fact(int n){
        int i=1;
        if(n<0){
            return -1;
        }
        int res=1;
        while(i<=n){
            res*=i;
            i++;
        }
        return res;
    }

    //Factorial in recursion
    public int fact_(int n){
        if(n<0){
            return -1;
        }
        else if(n==0 || n==1){
            return 1; 
        }
        return n*fact_(n-1);
    }
    
     // Fibonacci in iterative way
    public void fibonacci(int n){
        int[] result=new int[n];
        if(n<0){
            System.out.println("Incorrect input");
        }
        else if(n==1){
            result[0]=0;
        }
        else if(n==2){
            result[0]=0;
            result[1]=1;
        }
        result[0]=0;result[1]=1;
        int i=2;
        while(i<n){
            result[i]=result[i-1]+result[i-2];;
            i++;
        }
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]+" ");
        }
    }

    //Fibonacci in recursion
    public int fibonacci_(int n){
        if(n==0 ){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibonacci_(n-1)+fibonacci_(n-2);
    }

    public void printFibSeq(int n){
        for(int i=0; i<n;i++){
            System.out.print(fibonacci_(i)+" ");
        }
    }
}
