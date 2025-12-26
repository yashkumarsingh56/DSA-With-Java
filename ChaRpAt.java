package JAVA_DSA.basic.PATTERN;

import java.util.Scanner;

public class ChaRpAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
