class Solution {
    public int maxProfit(int[] prices) {
        int i=0 , j=1 , ans=0;
        while(j<prices.length){
            if(prices[i]<prices[j]){
                ans= Math.max(ans, prices[j]-prices[i]);  
            }
            else
                i=j;
            j++;
        }
        return ans;
    }
}
