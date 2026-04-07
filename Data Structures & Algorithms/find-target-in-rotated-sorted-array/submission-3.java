class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int index=-1;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=(right-left)/2 + left;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]==target){
                return left;
            }
            if(nums[right]==target){
                return right;
            }
            else{
                left++;
                right--;
            }
        }
        if(n==1){
            if(nums[0]==target){
                return 0;
            }
        }
        return index; 
    }
}
