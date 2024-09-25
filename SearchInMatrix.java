package JAVA_DSA.basic.T2DArray;

public class SearchInMatrix {
    public static boolean searchInMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target){
                System.out.println("found at: "+row + " " + col);
                return true;
            }
            else if (matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 15;
        searchInMatrix(matrix, target);
    }
}

