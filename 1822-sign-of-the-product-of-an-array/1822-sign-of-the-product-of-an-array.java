class Solution {
    public int arraySign(int[] nums) {
        Arrays.sort(nums);
        
        int cnt = 0;
        for (int n : nums) {
            if (n < 0)
                cnt++;
            else if (n == 0)
                return 0;
            else
                break;
        }
        
        return cnt % 2 == 0 ? 1 : -1;
    }
}