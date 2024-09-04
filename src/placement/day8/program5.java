package placement.day8;

public class program5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            if (arr[i]<= arr[i+1]){
                System.out.println(i);
            }
        }


    }
}
