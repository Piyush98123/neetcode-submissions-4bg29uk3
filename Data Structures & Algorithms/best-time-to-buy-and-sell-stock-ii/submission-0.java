class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int mp = sell-buy;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>sell){
                sell = prices[i];
            }
            else{
                mp=mp+(sell-buy);
                buy=prices[i];
                sell=prices[i];
            }
        }
        mp=mp+(sell-buy);
        return mp;
    }
}