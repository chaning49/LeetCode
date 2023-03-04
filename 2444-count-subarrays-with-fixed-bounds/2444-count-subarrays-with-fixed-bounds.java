class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int outIdx = -1;
        int minIdx = -1;
        int maxIdx = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                outIdx = i;
            if (nums[i] == minK)
                minIdx = i;
            if (nums[i] == maxK)
                maxIdx = i;
            
            int sum = Math.min(minIdx, maxIdx) - outIdx;
            if (sum > 0)
                ans += sum;
        }
        
        return ans;
    }
}