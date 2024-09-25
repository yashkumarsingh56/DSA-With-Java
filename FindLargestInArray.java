package ACCENTURE;

public class FindLargestInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,6};
        int Largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>Largest){
                Largest = arr[i];
            }
        }
        System.out.println(Largest);
    }
}
