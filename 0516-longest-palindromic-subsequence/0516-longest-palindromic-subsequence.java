class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        return dp(memo, s, 0, n - 1);
    }
    
    private int dp(int[][] memo, String s, int l, int r) {
        if (l > r)
            return 0;
        if (l == r)
            return 1;
        if (memo[l][r] > 0)
            return memo[l][r];
        
        if (s.charAt(l) == s.charAt(r))
            memo[l][r] = 2 + dp(memo, s, l + 1, r - 1);
        else
            memo[l][r] = Math.max(dp(memo, s, l + 1, r), dp(memo, s, l, r - 1));
        
        return memo[l][r];
    }
}