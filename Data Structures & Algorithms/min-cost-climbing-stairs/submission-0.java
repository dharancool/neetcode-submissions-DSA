class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] result=new int[cost.length+1];
        result[0]=0;
        result[1]=0;
        int n=cost.length;
        for(int i=2;i<n+1;i++){
            result[i]=Math.min(result[i-1] + cost[i-1], result[i-2] + cost[i-2]);
        }
        return result[n];
    }
}
