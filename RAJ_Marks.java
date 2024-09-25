package JAVA_DSA.basic.BASIC;

import java.util.Scanner;

public class RAJ_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of subjects in 2nd semester: ");
        int second = sc.nextInt();
        for (int i = 1; i <= second; i++) {
            second = sc.nextInt();
            System.out.println("Enter the marks " + i + ": ");
        }
        System.out.println("enter the no. of subjects int 3rd semester: ");
        int third = sc.nextInt();
        for (int i = 1; i <= third; i++) {
            third = sc.nextInt();
            System.out.println("Enter the marks " + i + ": ");
        }
    }
}
