package JAVA_DSA.basic.LOOPS;

import java.util.Scanner;

public class DisplayExcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the number of elements you wish to enter: ");
            int n = sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println(n);
        }
        while (true);
    }
}
