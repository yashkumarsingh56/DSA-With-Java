package JAVA_DSA.basic.T2DArray;

import java.util.Scanner;

public class TwoDarray {

    public static int Largest(int arr[][]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];

                }


            }

        }
        System.out.println(max);

        return max;
    }
    public static boolean search(int arr [][],int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==key){
                    System.out.println("Element found at:"+i+","+j);
                    return true;
                }
            }



        }
        System.out.println("Element not found");

        return false;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      int key =sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int [n][m];

        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
       // search(arr,key);
        Largest(arr);

    }


}
