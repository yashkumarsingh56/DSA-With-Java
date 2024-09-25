package JAVA_DSA.basic.ARRAY;

public class SubArray {
    public static void PrintsubArray(int arr[]){
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Subarray length: " + ts);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        PrintsubArray(arr);
    }
}
