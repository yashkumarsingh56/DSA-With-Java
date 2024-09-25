package JAVA_DSA.basic.STRINGS;

import java.util.Scanner;

public class string {
    public static void print(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.println(str.charAt(i));
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
//        char arr[] ={'a','b','c','d'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String");
//        String s = sc.nextLine();
//        System.out.println(s);
//        String fullname = "tony stark";
//        System.out.println(fullname.length());
        String firstname = "12345 ";
        String lastname = "Kumar";
        String fullname = firstname + lastname;
//        System.out.println(fullname.charAt(5));
        print(fullname);
    }
}
