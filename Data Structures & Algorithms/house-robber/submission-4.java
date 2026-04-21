class Solution {
    public int rob(int[] nums) {
        int[] dpTable=new int[nums.length];
        if(nums.length==0){
            return 0;
        }

        //Base Case
        dpTable[0]=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        dpTable[1]=Math.max(nums[0],nums[1]);
        if(nums.length==2){
            return dpTable[1];
        }

        int maxRobbed=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dpTable[i]=Math.max(maxRobbed,nums[i]+dpTable[i-2]);
            maxRobbed=dpTable[i];
        }
        return dpTable[nums.length-1];

    }
}
