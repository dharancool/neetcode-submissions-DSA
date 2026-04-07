class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int current=0;
        int next=1;
        int i=0;
        while(next<nums.length){
            if(nums[current]!=nums[next]){
                int temp=nums[next];
                nums[i + 1]=temp;
                current=next;;
                next++;
                count++;
                i++;
            } else{
                next++;
            }
            
        }
        return count;
        
    }
}