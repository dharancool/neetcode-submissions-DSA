class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums= new HashSet<Integer>();
        for(int i: nums){
            if(!uniqueNums.add(i)){
                return true;
            }
            uniqueNums.add(i);
        }
        return false;

        }
       
    }
