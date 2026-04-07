class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            j=i+1;
            while(j<n){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
                j++;
            }
        }
      
      return false;


        
    }
}