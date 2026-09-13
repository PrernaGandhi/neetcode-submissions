class Solution {
    public int maxProfit(int[] prices) {
        // max profit, buy less, sell more
        // and distance between two max - buy early, sell late
        // if i > j, that means we will have loss, so better
        // make j the buy price
        // if i < j , capture max profit

        int i = 0;
        int profit = 0;
        for(int j = 1; j <= prices.length - 1; j++) {
            if(prices[i] > prices[j]) {
                i = j;
                continue;
            }
            profit = Math.max(profit, prices[j] - prices[i]);
        }

        return profit;
        
    }
}
