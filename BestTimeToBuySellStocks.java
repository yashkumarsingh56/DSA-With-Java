package JAVA_DSA.basic.ARRAY;

public class BestTimeToBuySellStocks {
    public static int buySellStocks(int[] arr) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit  = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > buyprice){
                int profit = arr[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyprice = arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(buySellStocks(arr));

    }
}
