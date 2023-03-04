class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int j = -1;
        int prevMinIdx = -1;
        int prevMaxIdx = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                j = i;
            if (nums[i] == minK)
                prevMinIdx = i;
            if (nums[i] == maxK)
                prevMaxIdx = i;
            ans += Math.max(0, Math.min(prevMinIdx, prevMaxIdx) - j);
        }
        
        return ans;
    }
}