package JAVA_DSA.basic.STRINGS;

public class PrintLargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        String largestString = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(largestString.compareTo(fruits[i]) < 0){
                largestString = fruits[i];
            }
        }
        System.out.println(largestString);
    }
}
