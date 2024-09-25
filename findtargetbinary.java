package ACCENTURE;

public class findtargetbinary {
    public static int binary(int arr[], int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]<target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,4,6,9,8};
        int target = 5;
        System.out.println(binary(arr,target));
    }
}
