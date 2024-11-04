import java.util.Scanner;

public class Arrays_2D {
    Scanner sc = new Scanner(System.in);
    private static int row,col;
    private int[][] matrix;
    
    Arrays_2D(){
        System.out.println("Enter number of rows: ");
        row=sc.nextInt();
        System.out.println("Enter number of columns: ");
        col=sc.nextInt();
        matrix= new int[row][col];
    }

    public static void main(String[] args) {
        Arrays_2D arr = new Arrays_2D(); // using constructor to initialize object
        arr.getValues(row, col);
        arr.closeScanner();
        arr.displayValues(row, col);
    }
    

    public void getValues(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter the value: ");
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    public void displayValues(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void closeScanner(){
        sc.close();
    }

}
