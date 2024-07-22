package in.pbst;

public class problem20 {

    public static int maxProfit(int[] prices) {  
        int n = prices.length;
        int[] firstBuySellProfit = new int[n];
        int[] secondBuySellProfit = new int[n];
        
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            firstBuySellProfit[i] = Math.max(firstBuySellProfit[i - 1], prices[i] - minPrice);
        }
   
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            secondBuySellProfit[i] = Math.max(secondBuySellProfit[i + 1], maxPrice - prices[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, firstBuySellProfit[i] + (i + 1 < n ? secondBuySellProfit[i + 1] : 0));
        }     
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4}; 
        
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit with at most two transactions: " + maxProfit);
    }
}

