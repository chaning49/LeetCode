class Solution {
    public int minReorder(int n, int[][] connections) {
        List<Integer>[] graph = new List[n];
        
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();
        
        for (int[] conn : connections) {
            graph[conn[0]].add(conn[1]);
            graph[conn[1]].add(-conn[0]);
        }
        
        boolean[] visited = new boolean[n];
        return dfs(0, graph, visited);
    }
    
    private int dfs(int node, List<Integer>[] graph, boolean[] visited) {
        visited[node] = true;
        int cnt = 0;
        
        for (int neighbor : graph[node]) {
            if (!visited[Math.abs(neighbor)]) {
                cnt += dfs(Math.abs(neighbor), graph, visited);
                if (neighbor > 0)
                    cnt++;
            }
        }
        
        return cnt;
    }
}