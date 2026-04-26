class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set1=new HashSet<>();
        int left=0;
        for( int right=0; right<nums.length;right++){
            if(right-left>k){
                set1.remove(nums[left]);
                left+=1;
            }

            if(set1.contains(nums[right])){
                return true;
            }
            set1.add(nums[right]);
        }
        return false;


    }
}