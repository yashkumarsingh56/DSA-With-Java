package JAVA_DSA.basic.FunctionMethods;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void bintodec(int binNum){
        int myNum = binNum;
        int pow =0;
        int decNum=0;
        while(binNum >0){
            int Lastdigit=binNum%10;
            decNum=decNum+(Lastdigit*(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+ myNum+" ="+decNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binNum = sc.nextInt();

        bintodec(binNum);

    }
}
