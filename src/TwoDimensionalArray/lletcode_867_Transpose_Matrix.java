package TwoDimensionalArray;

public class lletcode_867_Transpose_Matrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,4},{5,6,7},{6,7,8}};
           transpose(matrix);
    }
    public static int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] TnasposeMAt = new int[n][m];

        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                TnasposeMAt[i][j]=matrix[j][i];
                System.out.print(TnasposeMAt[i][j]+" ");
            }
            System.out.println();
        }

        return TnasposeMAt;

    }



}
