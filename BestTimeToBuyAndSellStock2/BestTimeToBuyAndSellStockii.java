package leetcode;

public class BestTimeToBuyAndSellStockii {
	public static void main(String[] args){
		int[] prices = {3,2,1,2,3,4,5,4,3,2,3,4,5,6,7,6,5,4,5,6,7,8,9,8,7};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        
        int i = 0;
        int total = 0;
        
        while(i < prices.length - 1){
            int buy;
            int sell;
            
            while(i < prices.length - 1 && prices[i] > prices[i + 1]){
                i++;
            }
            
            buy = prices[i];
            i++;
            
            while(i < prices.length && prices[i] >= prices[i - 1]){
                i++;
            }
            
            sell = prices[i - 1]; 
            
            total += sell - buy;
        }
        
        return total;
    }
}
