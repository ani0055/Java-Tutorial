public class MaxProfit {
    public int maximumProfit(int prices[]) {
        // code here
        int initialP = 0;
        int finalP = 0;
        int profit = 0;
        for(int i = 1; i<prices.length;i++){
                if(prices[i] > prices[i-1]){
                    initialP = prices[i-1];
                    finalP = prices[i];
                    profit += finalP - initialP;
                    
                }
            }
            return profit;
        }
}
