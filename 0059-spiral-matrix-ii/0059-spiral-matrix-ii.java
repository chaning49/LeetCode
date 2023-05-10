class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int total = n * n;
        int cnt = 0;
        int num = 1;
        int stRow = 0;
        int endRow = n - 1;
        int stCol = 0;
        int endCol = n - 1;
        
        while (cnt < total) {
            // 왼쪽으로 이동
            for (int i = stCol; cnt < total && i <= endCol; i++) {
                ans[stRow][i] = num++;
                cnt++;
            }
            stRow++;
            
            // 아래로 이동
            for (int i = stRow; cnt < total && i <= endRow; i++) {
                ans[i][endCol] = num++;
                cnt++;
            }
            endCol--;
            
            // 왼쪽으로 이동
            for (int i = endCol; cnt < total && i >= stCol; i--) {
                ans[endRow][i] = num++;
                cnt++;
            }
            endRow--;
            
            // 위로 이동
            for (int i = endRow; cnt < total && i >= stRow; i--) {
                ans[i][stCol] = num++;
                cnt++;
            }
            stCol++;
        }
        
        return ans;
    }
}