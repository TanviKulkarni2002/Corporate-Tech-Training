public class Methods {
    public static void main(String[] args) {
        Methods m=new Methods();
        m.calcTable(6);
        m.starPattern(4);
        System.out.println(m.recursiveSum(10));
        m.reverseStarPattern(4);
        System.out.println(m.avgCalc(2,3,4,6));
    }

    public void calcTable(int n){
        int i=1;
        while(i<=10){
            System.out.print(n*i+" ");
            i++;
        }
        System.out.println();
    }

    public void starPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int recursiveSum(int n){
        int sum=n;
        if(n!=0){
            sum+=recursiveSum(n-1);
        }
        return sum;
    }

    public void reverseStarPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public float avgCalc(int ...varargs){
        int sum=0;
        for(int i=0;i<varargs.length;i++){
            sum+=varargs[i];
        }
        return (float)sum/varargs.length;
    }
}
