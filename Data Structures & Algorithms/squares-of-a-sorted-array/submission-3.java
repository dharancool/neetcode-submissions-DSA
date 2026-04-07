class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squarenums=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int resindex=nums.length-1;

        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                squarenums[resindex]=nums[left]*nums[left];
                left++;
            }else{
                squarenums[resindex]=nums[right]*nums[right];
                right--;
            } 
            resindex--;   
        }
        return squarenums;
    }
}