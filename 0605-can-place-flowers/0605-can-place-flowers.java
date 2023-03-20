class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int cnt = 0;
        
        for (int i = 0; i < len && cnt < n; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == len - 1) ? 0 : flowerbed[i + 1];
                if (prev == 0 && next == 0) {
                    flowerbed[i]++;
                    cnt++;
                }
            }
        }
        
        return cnt == n;
    }
}