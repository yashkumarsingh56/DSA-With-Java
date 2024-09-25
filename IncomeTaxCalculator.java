package JAVA_DSA.basic.CONDITIONAL;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the income in lakhs: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;
        if (income < 500000) {
            tax = 0;
        }

        if (income >= 500000 && income < 100000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);}
        System.out.println("your tax is: " + tax);
    }

}
