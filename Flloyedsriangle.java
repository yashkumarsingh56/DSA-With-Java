package JAVA_DSA.basic.PATTERN;

public class Flloyedsriangle {
    public static void flloyedsriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        flloyedsriangle(5);
    }
}
