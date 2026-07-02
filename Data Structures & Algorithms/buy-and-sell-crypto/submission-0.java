class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = prices.length - 1;
        int maximumProfit = 0;

        for(int i=0; i<prices.length-1; i++) {
            for(int j=i+1; j<prices.length; j++) {
                int profit = prices[j] - prices[i];
                maximumProfit = Math.max(maximumProfit, profit);
            }
        }

        return maximumProfit;
    }
}
