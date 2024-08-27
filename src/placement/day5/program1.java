package placement.day5;

public class program1 {
    public static void main(String[] args) {
        int n = 5;
        int s = 10;
        int[] a = {1, 2, 3, 7, 5};

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <a.length ; j++) {
                sum=(a[i]+a[j]);
                if(sum==s){
                    System.out.println(""+i+"   "+j);
                    break;
                }

            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] == s) {
                System.out.println("index are " + i +" " +(i + 1));
            }

        }
    }
}
