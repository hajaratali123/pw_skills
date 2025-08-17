public class MaximunSubArrySizeK {
    public static void main(String[] args) {
      // int arr[] = {12,34,56,6,77,8,0};
        int arr[]={10,20,1,3,-40,80,10};
        int k =2;

        // int maxsum = Integer.MIN_VALUE;


        // for(int i =0 ; i<n-k+1 ; i++){
        //     int sum=0;
        //     for (int j = i ; j <i+k; j++) {
        //         sum += arr[j];
        //     }
        //     maxsum = Math.max(maxsum, sum);
        // }

        Answer(arr,k);
        Answer2(arr, k);
        System.out.println("Ans 3");
        Answer3(arr,k);


        
    }

    private static void Answer2(int[] arr, int k) {
    int n = arr.length;
    int maxsum =0;
    int sum =0;
    for (int i =0; i <k; i++){
        sum+=arr[i];
    }

    maxsum=sum;
    int i =0;
    int j =k;
    while(j<n){
        sum=sum-arr[i]+arr[j];
        maxsum=Math.max(maxsum, sum);
        i++;j++;
    }
     System.out.println("Maximum sum of subarray of size " + k + " is: " + maxsum);
    }

    private static void Answer(int[] arr, int k) {
    int n = arr.length;
    int maxsum=0;

        int i=0,j=k,sum=0;
        for(int a =0; a<k; a++){
            sum += arr[a];
        }
        maxsum=sum;
        i=0;
        j=k;
        while(j<n){
            sum = sum-arr[i]+arr[j];
            maxsum= Math.max(maxsum, sum);
            i++;j++;

        }
        System.out.println(maxsum);
        
    }

    private static void Answer3(int[] arr, int k) {
        int n = arr.length;
        int t = 4;
        int cnt=0;
        int i=0,j=0,sum=0;
        int maxsum = 0;
        for(int a = 0;a<k;a++){
            sum+=arr[a];
        }
        if(sum/k>=t)cnt++;

        maxsum =sum;
        i=0;j=k;
        while(j<n){
            sum=sum-arr[i]+arr[j];
            maxsum = Math.max(maxsum,sum);
              if(sum/k>=t)cnt++;
            i++;j++;
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxsum +"The count is :"+cnt);
    }
    
}
