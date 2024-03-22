class CasualSolution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int totalProfit = 0;
        for (var i = 1; i < prices.length; i++){
            if (prices[i] - buy > profit){
                profit = prices[i] - buy;
            } else {
                buy = prices[i];
                totalProfit += profit;
                profit = 0;
            }
        }
        totalProfit += profit;
        return totalProfit;
    }
}