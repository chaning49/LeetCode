class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0 && !dfs(graph, i, 1, visited)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(int[][] graph, int curr, int group, int[] visited) {
        visited[curr] = group;
        
        for (int neighbor : graph[curr]) {
            if (visited[neighbor] == group) {
                return false;
            }
            
            if (visited[neighbor] == 0 && !dfs(graph, neighbor, -group, visited)) {
                return false;
            }
        }
        
        return true;
    }
}