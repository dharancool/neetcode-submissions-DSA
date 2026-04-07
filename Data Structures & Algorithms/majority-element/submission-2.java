class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int freq=n/2;
        int count=1;
        int curr=0;
        int next=1;
        int k;
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }

        for(int i=0;i<n;i++){
            if(count<freq){
                if(nums[curr]!=nums[next]){
                    int temp=next;
                    curr=temp;
                    next++;
                } else{
                    count++;
                    next++;
                }
            }else{
                return nums[next];
            }
            
        }
        
      return 0;   
    }
}