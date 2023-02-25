class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int pivot = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > pivot)
                ans = Math.max(ans, prices[i] - pivot);
            else
                pivot = prices[i];
        }
        
        return ans;
    }
}