package JAVA_DSA.basic.FunctionMethods;

import java.util.Scanner;

public class SumofTWo {
    public static void CalculateSum(int a, int b) {


        int sum = a + b;
        System.out.println("The sum of the two numbers is " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        CalculateSum(a,b);
    }
}
