package JAVA_DSA.basic.BASIC;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while (num > 0){
            sum += num%10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
