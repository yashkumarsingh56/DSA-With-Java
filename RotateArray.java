package JAVA_DSA.basic.ARRAY;

public class RotateArray {
    public static boolean rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        for(int j = 1; j <n; j++){
            int temp = arr[j];
            arr[j] = arr[n-1-j];
            for (int i= arr.length-2; i>=0; i--){
                arr[i] = arr[i+1];
            }
            arr[0] = temp;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(rotate(arr,3));
    }
}
