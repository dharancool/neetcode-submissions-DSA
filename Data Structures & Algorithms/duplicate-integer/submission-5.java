class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsSet=new HashSet<Integer>();
        int nums_length=nums.length;
        for(int i=0;i<nums_length;i++){
            numsSet.add(nums[i]);
        }
        if(nums_length==1){
            return false;
        }
        if(numsSet.size()!=nums_length){
            return true;
        }else{
            return false;
        }
        }
       
    }
