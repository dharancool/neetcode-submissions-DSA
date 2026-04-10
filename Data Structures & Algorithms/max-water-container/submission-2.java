class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int n=heights.length;
        int currWater=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int width=j-i;
                currWater=width * Math.min(heights[j],heights[i]);
                if(currWater>maxWater){
                maxWater=currWater;
            }
            }
            
        }
        return maxWater;

    }
}
