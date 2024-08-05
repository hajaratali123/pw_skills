package TwoDimensionalArray;

public class Basic2Darray3 {
    public static void main(String[] args) {

        int[] a = {2,4,5,6,7};
        for(int ele : a){
            System.out.println(ele);
        }
        // for 2D -Array
        System.out.println("using for each loop");
        int[][] b ={{2,3,4},{3,5,6,}};
        for(int[] le : b){
            for(int x : le ) {
                System.out.print(x);
            }
            System.out.println();
        }

    }
}
