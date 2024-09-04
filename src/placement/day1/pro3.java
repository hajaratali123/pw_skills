package placement.day1;

public class pro3 {
    public static void main(String[] args) {
        int k =4;
        int sum =0;
        int max =0;
        int[] arr ={1,2,3,4,5,6,5,6,};
        for (int i = 0; i < arr.length-k+1; i++) {
            for (int j = i; j < k+i; j++) {
                sum += arr[j];}
                max = Math.max(max,sum);
            sum =0;
            System.out.println("max 1 "+max);
            }
            System.out.println("max 2 "+max);
        }

}
