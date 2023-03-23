class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1)
            return -1;
        
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();
        
        for (int[] conn : connections) {
            graph[conn[0]].add(conn[1]);
            graph[conn[1]].add(conn[0]);
        }
        
        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
                ans++;
            }
        }
        
        return ans - 1;
    }
    
    private void dfs(List<Integer>[] graph, boolean[] visited, int node) {
        visited[node] = true;
        for (int neighbor : graph[node]) {
            if (!visited[neighbor])
                dfs(graph, visited, neighbor);
        }
    }
}