package LeetCodeDsa;
// 7,1,5,3,6,4
public class BestTimetoBuyandSellStocks {
 public int maxProfit(int []prices) {
	 int buy_price=prices[0];       //initially set to zero
	 int profit=0;                 //initially set to zero
	 for(int i=0;i<prices.length;i++) {
		 if(buy_price > prices[i]) {
			 buy_price=prices[i];
		 }
		 else {
			 int current_profit=prices[i]-buy_price;
			 profit=Math.max(current_profit,profit);
		 }
	 }
	 return profit;
 }
 public static void main(String args[]) {
	 int []prices= {7,1,5,3,6,4};
	 BestTimetoBuyandSellStocks profit= new BestTimetoBuyandSellStocks();
	int maxProfit= profit.maxProfit(prices);
	System.out.println("Maximum profit:"+ maxProfit);
	 
 }
}
