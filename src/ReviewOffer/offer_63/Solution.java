package ReviewOffer.offer_63;

public class Solution {
    // 遍历找最小值 求基于最小值的最大收益 求最大收益
    public int maxProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price :
                prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit= Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
