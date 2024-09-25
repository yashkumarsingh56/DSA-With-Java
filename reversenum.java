package JAVA_DSA.basic.BASIC;

public class reversenum {
    public static void revnum(){
        int n = 240371;
        int rev = 0;
        while (n>0){
            rev = rev*10;
            rev = rev+n%10;
            n = n/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {

        revnum();

    }
}
