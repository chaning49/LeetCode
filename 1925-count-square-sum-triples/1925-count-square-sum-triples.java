class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sq = i * i + j * j;
                int tr = (int) Math.sqrt(sq);
                if (tr * tr == sq && tr <= n)
                    cnt += 2;
            }
        }
        
        return cnt;
    }
}