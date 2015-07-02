package leetcode;

public class BestTimeToBuyAndSellStockiii {
	public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }   
        
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        
        int min_left = prices[0];
        left[0] = 0;
        for(int i = 1; i < prices.length; i++){
            min_left = Math.min(min_left, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - min_left);
        }
        
        int max_right = prices[prices.length - 1];
        right[prices.length - 1] = 0;
        for(int i = prices.length - 2; i >= 0; i--){
            max_right = Math.max(max_right, prices[i]);
            right[i] = Math.max(right[i + 1], max_right - prices[i]);
        }
        
        int result = 0;
        for(int i = 0; i < prices.length; i++){
            if(left[i] + right[i] > result){
                result = left[i] + right[i];
            }
        }
        
        return result;
    }
}
