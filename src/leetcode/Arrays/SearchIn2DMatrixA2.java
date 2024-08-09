package leetcode.Arrays;

public class SearchIn2DMatrixA2 {
    public static boolean SearchMatrix(int[][] arr , int target){
        int m= arr.length,n = arr[0].length;
        int i =0,j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) return  true;
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,3,6,7},{5,7,9,9},{8,4,7,9}};
        int target = 2;
        boolean res =SearchMatrix(arr,target);
        System.out.println(res);

    }
}
