package JAVA_DSA.basic.CONDITIONAL;

import java.util.Scanner;

public class LARGESTOF3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>=b)&&(a>=c)){
            System.out.println("A"+a);
        }
        else if((b>=c)){
            System.out.println("B"+b);
        }
        else {
            System.out.println("C"+c);
        }
    }
}
