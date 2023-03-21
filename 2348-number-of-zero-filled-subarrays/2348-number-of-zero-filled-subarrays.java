class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0L;
        boolean isZero = false;
        long n = 0L;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;
                ans += (i == nums.length - 1) ? (n * (n + 1)) / 2 : 0;
            } else {
                ans += (n * (n + 1)) / 2;
                n = 0L;
            }
        }
        
        return ans;
    }
}