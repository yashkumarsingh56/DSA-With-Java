package JAVA_DSA.basic.CONDITIONAL;

import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
