class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minsofar = prices[0];
        for(int i = 1; i<prices.length; i++){
            minsofar = Math.min(minsofar,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minsofar);
        }
        return maxProfit;
        
    }
}