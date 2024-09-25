package JAVA_DSA.basic.ARRAY;

public class LargestNumber {
    public static int largestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,15,65,12,35,641,454,215};
        System.out.println(largestNumber(numbers));
    }
}
