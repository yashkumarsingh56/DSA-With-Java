package JAVA_DSA.basic.BASIC;

import java.util.Scanner;

public class OE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if((m&1)==1){
            System.out.println("odd");
        }
        else System.out.println("even");
    }
}
