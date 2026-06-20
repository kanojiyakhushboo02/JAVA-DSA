public class BuyNSellStock {
    

    public static int maxProfit(int[]prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(minPrice < prices[i]){
                int tprofit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, tprofit);
            }else{
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("The maximum profit is: " + result);
    }
}
