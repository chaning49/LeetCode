class Solution {
    private final int MOD = 1_000_000_007;
    
    public int ways(String[] pizza, int k) {
        int m = pizza.length, n = pizza[0].length();
        
        // 중복 방문을 피하기 위한 dp, 횟수별로 값을 저장해서 해당 위치에 값이 있으면 새로 계산하지 않고 가져다 사용할 수 있어 성능상 유리하다.
        Integer[][][] dp = new Integer[k][m][n];
        
        // 피자에서 각 위치부터 남은 피자 조각에 포함된 사과의 개수를 저장하는 부분합 배열이다. 사과가 없으면 -> invalid
        int[][] preSum = new int[m+1][n+1]; 
        
        // 부분합을 저장하기 때문에 인덱스가 작을 수록 값이 커질 수 밖에 없다. 물론 인덱스에 해당하는 값이 존재할 때 이야기다.
        for (int r = m - 1; r >= 0; r--)
            for (int c = n - 1; c >= 0; c--)
                preSum[r][c] = preSum[r][c+1] + preSum[r+1][c] - preSum[r+1][c+1] + (pizza[r].charAt(c) == 'A' ? 1 : 0); 
        
        return dfs(m, n, k-1, 0, 0, dp, preSum);
    }
    int dfs(int m, int n, int k, int r, int c, Integer[][][] dp, int[][] preSum) {
        if (preSum[r][c] == 0) return 0; // 만약 남은 피자 조각에 사과가 없다면 -> invalid
        if (k == 0) return 1; // k - 1회의 절단을 유효하게 만들기 위해서 처리해주는 코드이다.
        if (dp[k][r][c] != null) return dp[k][r][c]; // dp에 값이 존재하면 해당 값을 반환해준다. -> 계산할 필요가 없어서 속도가 빨라진다.
        
        int ans = 0;
        
        // cut in horizontal
        for (int nr = r + 1; nr < m; nr++) 
            if (preSum[r][c] - preSum[nr][c] > 0) // 만약 이전에 존재하는 조각에 사과가 적어도 하나 이상 있다면 절단, 현재 위치에 해당하는 값이 있으면 무조건 다음에 사과가 있다는 의미이기 때문이다.
                ans = (ans + dfs(m, n, k - 1, nr, c, dp, preSum)) % MOD;
        // cut in vertical
        for (int nc = c + 1; nc < n; nc++) 
            if (preSum[r][c] - preSum[r][nc] > 0) // 만약 이전에 존재하는 조각에 사과가 적어도 하나 이상 있다면 절단, 현재 위치에 해당하는 값이 있으면 무조건 다음에 사과가 있다는 의미이기 때문이다.
                ans = (ans + dfs(m, n, k - 1, r, nc, dp, preSum)) % MOD;
        return dp[k][r][c] = ans;
    }
}