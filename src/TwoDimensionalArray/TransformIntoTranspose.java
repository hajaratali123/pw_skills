package TwoDimensionalArray;




public class TransformIntoTranspose {
    public static int m ,n;

    public static void print(int[][] ar){
        m = ar.length;


        for(int i=0; i<m; i++){
            for (int j=0;j<m;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int [][] ar = {{1,2,3},{4,5,6},{7,8,9}};
        print(ar);
       int m = ar.length;

        for(int i=0; i<m; i++){
            for (int j=0;j<i;j++){
                int temp = ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
        System.out.println("Transpose of Array : ");
        print(ar);
        System.out.println("Rotation at 90 Degree:");
        for(int i=0; i<m; i++){
           int a=0,b=m-1;
           while (a<b){
               int temp = ar[i][a];
               ar[i][a]=ar[i][b];
               ar[i][b]=temp;
               a++;
               b--;

           }
        }
        print(ar);


    }
}
