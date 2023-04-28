class Solution {
    public int numSimilarGroups(String[] strs) {
        int ans = 0;
        boolean[] visited = new boolean[strs.length];
        
        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                dfs(strs, i, visited);
                ++ans;
            }
        }
        
        return ans;
    }
    
    private void dfs(String[] strs, int i, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < strs.length; j++) {
            if (!visited[j] && isSimilar(strs[i], strs[j]))
                dfs(strs, j, visited);
        }
    }
    
    private boolean isSimilar(String x, String y) {
        int diff = 0;
        for (int i = 0; i < x.length(); i++)
            if (x.charAt(i) != y.charAt(i))
                ++diff;
        return diff > 2 ? false : true;
    }
}