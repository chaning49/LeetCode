class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (i * j == 0 || i == n - 1 || j == m - 1)
                    if (grid[i][j] == 1)
                        dfs(grid, i, j);
        
        int ans = 0;
        
        for (int[] row : grid)
            ans += Arrays.stream(row).sum();
        
        return ans;
                
    }
    
    private static void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length)
            return;
        if (grid[i][j] == 0)
            return;
        
        grid[i][j] = 0;
        
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}