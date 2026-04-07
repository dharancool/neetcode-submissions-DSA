class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];
        int product=1;
        int cons=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                product=cons + product*nums[j];
            }
            output[i]=product;
            product=1;
        }
        return output;
    }
}  
