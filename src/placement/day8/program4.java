//package placement.day8;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class program4 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int[] arr={1,2,3,4,5,6,7,8,9,20};
//        int sum =14;
//        int n = arr.length;
//
//        for (int i = 0; i <n ; i++) {
//            for (int j = 1; j <n ; j++) {
//                if((arr[i]+arr[j])==sum){
//                    System.out.println(arr[i]+" "+ arr[j]);
//                   // System.out.println(i+" "+j);
//                    break;
//                }
//            }
//
//        }
//
//    }
//
//    public static boolean hasPairWithSum(int[] arr,int sum){
//
//        HashSet<Integer> SeeNumbers= new HashSet<>();
//        for (int num : arr){
//            int complement = sum-sum;
//            if (SeeNumbers.contains(complement)) {
//                return true;
//            }
//        }
//
//    }
//
//}
