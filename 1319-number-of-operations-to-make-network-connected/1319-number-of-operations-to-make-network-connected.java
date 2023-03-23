class Solution {
    public int makeConnected(int n, int[][] connections) {
        // 케이블의 개수는 최소 n - 1개여야 하므로 그보다 작은 경우는 -1 반환
        if (connections.length < n - 1)
            return -1;
        
        // 그래프를 만든다. 배열 내에 리스트 객체가 들어가는 형태이다.
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();
        
        // connections에 있는 1차원 배열 하나를 graph에 양 방향으로 삽입해서 연결 관계를 표시한다.
        for (int[] conn : connections) {
            graph[conn[0]].add(conn[1]);
            graph[conn[1]].add(conn[0]);
        }
        
        // 방문한 그룹을 표시하기 위해 사용한다.
        boolean[] visited = new boolean[n];
        int ans = 0;
        
        // 방문하지 않은 노드를 dfs로 탐색한다. 탐색 후에는 연결이 끊어진 것이므로 연결이 필요한 간선(ans)을 하나 늘려준다.
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
                ans++;
            }
        }
        
        // 간선의 개수이기 때문에 하나를 빼주어야 한다.
        return ans - 1;
    }
    
    private void dfs(List<Integer>[] graph, boolean[] visited, int node) {
        // 해당 값을 방문했으므로 표시한다.
        visited[node] = true;
        
        // 연결된 그래프를 모두 방문 표시한다.
        for (int neighbor : graph[node]) {
            if (!visited[neighbor])
                dfs(graph, visited, neighbor);
        }
    }
}