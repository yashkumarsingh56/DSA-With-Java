package ACCENTURE;

public class FindMissingInArray {
    public static int Missing(int arr[]){
        int n = arr.length;
        int total =(n)*(n+1)/2;
        int sum = 0;
        for (int i = 0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(total);

        return total-sum;

    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5};
        System.out.println(Missing(arr));
    }
}
