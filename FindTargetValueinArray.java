package ACCENTURE;

public class FindTargetValueinArray {
    public static void main(String[] args) {
        int target = 6;
        int arr[] = {1,2,3,6,8,9};
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                System.out.println("target is ="+i);

            }
        }

    }
}
