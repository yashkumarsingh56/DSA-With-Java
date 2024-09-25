package JAVA_DSA.basic.FunctionMethods;

public class DecimalToBinary {
    public static void DecToBin(int n) {
        int pow = 0 ;
        int binum = 0;
        while(n > 0) {
            int rem = n % 2;
            binum = binum +(int) (rem*Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary form of"+n+" = "+binum);
    }
    public static void main(String[] args) {
        DecToBin(7);

    }
}
