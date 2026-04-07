class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        int n=nums.length;
        int i=0;
        while(!set.contains(nums[i])){
            set.add(nums[i]);
            i++;
        }
        return nums[i];
        
    }
}
