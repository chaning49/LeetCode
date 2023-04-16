class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        int ans = 1;
        while (ans <= n) {
            for (int i = 1; i <= ans; ++i) {
                for (int j = 1; j <= ans; ++j) {
                    if (i * i + j * j == ans * ans)
                        ++cnt;
                }
            }
            ++ans;
        }
        
        return cnt;
    }
}