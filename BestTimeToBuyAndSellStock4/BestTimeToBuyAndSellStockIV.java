package leetcode;

public class BestTimeToBuyAndSellStockIV {
	public int maxProfit(int k, int[] prices) {
		if(prices == null || prices.length == 0){
			return 0;
		}
      
		if(k > prices.length){
			int res = 0;
			for(int i = 0; i < prices.length - 1; i++){
				int degit = prices[i + 1] - prices[i];
				if(degit > 0){
					res += degit;
				}
			}
          
			return res;
		}
    
		int[][] global = new int[prices.length][k + 1];
		int[][] local = new int[prices.length][k + 1];
		for(int i = 0; i < prices.length - 1; i++){
			int diff = prices[i + 1] - prices[i];
			for(int j = 0; j <= k - 1; j++){
				local[i + 1][j + 1] = Math.max(global[i][j] + Math.max(diff, 0), local[i][j + 1] + diff);
				global[i + 1][j + 1] = Math.max(global[i][j + 1],local[i + 1][j + 1]);
			}
		}
      
		return global[prices.length - 1][k];
	}
}
