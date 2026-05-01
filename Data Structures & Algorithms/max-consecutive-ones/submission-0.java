class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount=0;
        int maxCount=0;
        for( int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currcount+=1;
            }else{
                maxCount=Math.max(currcount,maxCount);
                currcount=0;
            }  
        }
        maxCount=Math.max(currcount,maxCount);
        return maxCount;
    }
}