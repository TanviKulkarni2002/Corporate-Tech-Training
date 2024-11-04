// import java.util.Scanner;

// public class Arrays_Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float[] arr = new float [5];
//         for(int i=0;i<arr.length;i++){
//             System.out.print("Enter the value: ");
//             arr[i]=sc.nextFloat();
//         }
//         sc.close();
//         float sum=0.0f;
//         for(float a: arr){
//             sum+=a;
//         }
//         System.out.println("Sum of entered values: "+sum);
//     }
// }

// public class Arrays_Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float[] arr = {2.3f,1.4f,4,2f,6.7f,1.1f};
//         System.out.println("Enter the number to look for: ");
//         float num = sc.nextFloat();
//         for(int i=0;i<arr.length;i++){
//             if (arr[i]==num){
//                 System.out.print("Value detected in array");
//                 return;
//             }
//         }
//         System.out.println("Value not found");
//     }
// }

// public class Arrays_Practice {
//         public static void main(String[] args) {
//             float[] arr = {45,32,67,79,86,55,90};
//             float sum=0.0f;
//             for(float a: arr){
//                 sum+=a;
//             }
//             System.out.println("Average: "+sum/arr.length);
//         }
//     }

// public class Arrays_Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int rows=2,cols=3;
//         float[][] arr1= new float[rows][cols];
//         float[][] arr2= new float[rows][cols];

//             System.out.println("Fill Matrix 1");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print("Enter the value: ");
//                 arr1[i][j]=sc.nextFloat();
//             }
//         }
//         System.out.println("Fill Matrix 2");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print("Enter the value: ");
//                 arr2[i][j]=sc.nextFloat();
//             }
//         }
//         sc.close();

//         System.out.println("Displaying Entered Matrix");
//         System.out.println("Matrix1");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print(arr1[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("Matrix2");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print(arr2[i][j]+" ");
//             }
//             System.out.println();
//         }

//         System.out.println("Addition Result");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print(arr1[i][j]+arr2[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Arrays_Practice{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         for(int i=0;i<arr.length/2;i++){
//             int temp=arr[i];
//             arr[i]=arr[arr.length-i-1];
//             arr[arr.length-i-1]=temp;
//         }
//         for(int a:arr){
//             System.out.print(a+" ");
//         }
//     }
// }

// public class Arrays_Practice{
//     public static void main(String[] args) {
//         float[] arr = {2.3f,3.45f,4.56f,9.63f};
//         float max=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if (arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.println("Maximum Element: "+max);
//     }
// }

// public class Arrays_Practice{
//     public static void main(String[] args) {
//         float[] arr = {2.3f,3.45f,4.56f,9.63f};
//         float min=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if (arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         System.out.println("Minimum Element: "+min);
//     }
// }

public class Arrays_Practice{
    public static void main(String[] args) {
        float[] arr = {2.3f,3.45f,4.56f,9.63f};

        if (isSorted(arr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        // for(float a: arr){
        //     System.out.print(a+" ");
        // }
    }

    public static boolean isSorted(float[] arr){
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }   
}