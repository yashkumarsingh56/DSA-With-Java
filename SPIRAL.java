package JAVA_DSA.basic.T2DArray;

import java.util.ArrayList;

public class SPIRAL {
    public static ArrayList<Integer> spiral(int matrix[][]){
        ArrayList<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int r = 0, c = 0;
        while (r < row && c < col){
            for (int j = c; j <= col; j++){
                ans.add(matrix[r][j]);
                r++;
            }
            for(int i=r+1;i<=row;i++){
                ans.add(matrix[i][col-1]);
                col-- ;
            }
            for(int j = col-1; j <=c && r<row; j--){
                ans.add(matrix[row-1][j]);
                row --;
            }
            for (int i = row-1; i >= r && c<col; i--){
                ans.add(matrix[i][c]);
                c++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiral(matrix));
    }
}
