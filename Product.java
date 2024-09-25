package JAVA_DSA.basic.FunctionMethods;

import java.util.Scanner;

public class Product {
    public static int Multiply(int a, int b) {
        return a * b;

    }
    public static void main(String[] args) {
        int prod = Multiply(2, 3);
        System.out.println(prod);
        int prod2 = Multiply(3, 4);
        System.out.println(prod2);
    }
}
