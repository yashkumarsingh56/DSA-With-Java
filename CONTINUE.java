package JAVA_DSA.basic.LOOPS;

public class CONTINUE {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
