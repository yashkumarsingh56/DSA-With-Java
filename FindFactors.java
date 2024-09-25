package JAVA_DSA.basic.BASIC;

public class FindFactors {
    public static void main(String[] args) {
        int num = 54;

        System.out.println( "Factors of " + num + " are " );

        // finding and printing factors b/w 1 to num
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.print(i + " ");
        }

    }
}
