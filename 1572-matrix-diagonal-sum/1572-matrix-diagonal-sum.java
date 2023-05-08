class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            if (i == (n - i - 1))
                ans += mat[i][i];
            else
                ans += mat[i][i] + mat[i][n - i - 1];
        }
        
        return ans;
    }
}