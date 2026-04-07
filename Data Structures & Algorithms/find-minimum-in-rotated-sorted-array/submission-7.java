class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(right-left)/2 + left;
            if(nums[mid]>nums[right]){
                left=mid+1;  
            }else{
                right=mid;
                min=nums[right];
            }
        }
        return nums[left]; 
    }
}
