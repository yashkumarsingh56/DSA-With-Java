package JAVA_DSA.basic.ARRAY;

public class MaxSubArraySum {
    public static void maxSubArray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            int start = i;
            for (int j=i;j<arr.length;j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k<=end; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxsum = "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        maxSubArray(arr);
    }
}
