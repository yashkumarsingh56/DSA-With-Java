package JAVA_DSA.basic.FunctionMethods;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }
    public static int bincoeff(int n,int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int bc = factorial(n-r);
        int bincof = n_fact / (r_fact * bc);
        return bincof;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(bincoeff(n,r));
    }
}
