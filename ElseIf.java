package JAVA_DSA.basic.CONDITIONAL;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are adult");
        } else if ((age >= 13)&&(age<18)) {
            System.out.println("You are child");

        }
        else System.out.println("You are infant");
    }
}
