package JAVA_DSA.basic.FunctionMethods;

public class AllPrime {
    public static boolean isPrime(int n) {
        if (n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(isPrime(10));
PrimeInRange(20);
    }
}
