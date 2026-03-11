public class MaxProfitS {
    
    //Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell

    public static int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price; // found a new minimum
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice; // better profit found
        }
    }

    return maxProfit;
}
}
