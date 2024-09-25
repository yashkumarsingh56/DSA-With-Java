package JAVA_DSA.basic.ARRAY;

public class SumOfOddPlaceElements {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {1,5,6,4,9,2,5,4};
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 1) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
