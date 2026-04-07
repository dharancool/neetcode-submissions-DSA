class Solution {
    public int buyChoco(int[] prices, int money) {
       int minCost=Integer.MAX_VALUE;
       for(int i=0;i<prices.length-1;i++){
        for(int j=i+1;j<prices.length;j++){
            int pairCost=prices[i] + prices[j];
            if(pairCost>=0){
                minCost=Math.min(pairCost,minCost);
            }
        }
       }
       if(money-minCost<0){
        return money;
       }
       return money - minCost;
    }
}