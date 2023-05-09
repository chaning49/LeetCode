class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;
        int cnt = 0;
        int stRow = 0;
        int endRow = m - 1;
        int stCol = 0;
        int endCol = n - 1;
        
        while (cnt < total) {
            // 오른쪽으로 가는 경우
            for (int i = stCol; cnt < total && i <= endCol; i++) {
                ans.add(matrix[stRow][i]);
                cnt++;
            }
            stRow++;
            
            // 아래로 가는 경우
            for (int i = stRow; cnt < total && i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
                cnt++;
            }
            endCol--;

            // 왼쪽으로 가는 경우
            for (int i = endCol; cnt < total && i >= stCol; i--) {
                ans.add(matrix[endRow][i]);
                cnt++;
            }
            endRow--;
            
            // 위로 가는 경우
            for (int i = endRow; cnt < total && i >= stRow; i--) {
                ans.add(matrix[i][stCol]);
                cnt++;
            }
            stCol++;
        }
        
        return ans;
    }
}