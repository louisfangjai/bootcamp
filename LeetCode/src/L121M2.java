class Solution {
    public int maxProfit(int[] prices) {
        var maxProfit = 0;
        var minPrice = prices[0];

        for(int i=1; i < prices.length; i++)
        {
            if(prices[i] > minPrice )
            {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
            else
            {
                minPrice = prices[i];
            }

            
        }

        return maxProfit;

    }
}