package JAVA_DSA.basic.T2DArray;

public class DiagonalSum {
    public static int Dsum(int matrix[][]){
        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                //primary diagonal
//                if (i==j){
//                    sum+=matrix[i][j];
//                } else if (i+j == matrix.length-1) {
//                    sum+=matrix[i][j];
//                }
//
//                }
//            }
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i!=matrix.length-1-i)
            sum += matrix[i][matrix.length -i-1];
        }
        return sum;
        }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
        int sum = DiagonalSum.Dsum(arr);
        System.out.println(sum);
    }
}

