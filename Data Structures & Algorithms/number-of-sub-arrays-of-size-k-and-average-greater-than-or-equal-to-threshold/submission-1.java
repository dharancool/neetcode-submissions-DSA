class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int sum=0;
        int no_of_subarrays=0;
        int right=k-1;
        while(right<arr.length){
            int curr_left=left;
            while(left<=right){
                sum+=arr[left];
                left++;
            }
            int avg=sum/k;
            if ( avg>=threshold){
                no_of_subarrays+=1;
            }
            right+=1;
            left=curr_left+1;
            sum=0;
        }
        return no_of_subarrays;
        
    }
}