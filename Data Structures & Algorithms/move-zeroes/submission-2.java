class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        int n=nums.length;
        while(right<n){
            if(nums[left]==0 && nums[right]==0){
                right+=1;
            }else{
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left+=1;
                right+=1;
            }
        }     
    }
}