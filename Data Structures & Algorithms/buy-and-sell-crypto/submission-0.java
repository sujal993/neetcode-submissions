class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            int min = prices[i];
            int max = prices[i];

            // Find the biggest number after the current position
            for (int j = i + 1; j < prices.length; j++) {

                if (prices[j] > max) {
                    max = prices[j];
                }
            }

            int profit = max - min;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}