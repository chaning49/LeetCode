class Solution {
    public int minimizeArrayValue(int[] nums) {
        long ans = nums[0];
        long sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, (long) Math.ceil((double) sum / (i + 1)));
        }
        
        return (int) ans;
    }
}