class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int price: prices){
            if (price < buy){
                buy = price;
            } else if (profit < price - buy){
                profit = price - buy;
            }
        }
        return profit;
    }
}