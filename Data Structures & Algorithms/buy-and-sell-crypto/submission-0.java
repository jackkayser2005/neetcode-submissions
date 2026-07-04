class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1; 

        int Bestprofit = 0; 

        while(r < prices.length) {
            int buy = prices[l];
            int sell = prices[r];
            if(buy < sell) {
                int tempProfit = sell - buy;
                Bestprofit = Math.max(Bestprofit, tempProfit);
            } else {
                l = r; 
            }
            r++; 
            
        }



        return Bestprofit; 
    }
}
