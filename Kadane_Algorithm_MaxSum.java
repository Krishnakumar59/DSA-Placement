class Kadane_Algorithm_MaxSum{

    public static void main(String[] args) {
        int  N = 5;
     int [] arr = {1,2,3,-2,5};
     int ans = maxSubarraySum(arr,N);
    System.out.println(ans);



     }
     
     // arr: input array
         // n: size of array
         //Function to find the sum of contiguous subarray with maximum sum.
     static int maxSubarraySum(int arr[], int n){ // any issue then change int to long return type
     
             int sum=arr[0];
             int max_sum=arr[0];
             for(int i=1; i<arr.length; i++) 
             {
                 sum = Math.max(arr[i], sum+arr[i]);
                 if(sum>max_sum) 
                 {
                     max_sum=sum;
                 }
             }
             return max_sum;
         }

}
