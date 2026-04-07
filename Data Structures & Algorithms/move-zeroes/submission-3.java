class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        int n=nums.length;
        while(right<n){
            if(nums[left]==0 && nums[right]==0){
                right+=1;
            }else{
                swap(nums,left,right);
                left+=1;
                right+=1;
            }
        }     
    }

    public void swap(int[] nums, int left, int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}