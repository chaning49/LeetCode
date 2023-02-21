class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        if (nums.length == 1) return nums[0];
        
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[2 * i] != nums[2 * i + 1]) {
                ans = nums[2 * i];
                return ans;
            }
        }
        if (nums.length % 2 == 1) ans = nums[nums.length - 1];
        return ans;
    }
}