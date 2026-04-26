class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold){
            count+=1;
        }

        for(int right=k;right<arr.length;right++){
            sum+=arr[right];
            sum-=arr[right-k];
            if(sum/k>=threshold){
                count+=1;
            }

        }
        return count; 
    }
}