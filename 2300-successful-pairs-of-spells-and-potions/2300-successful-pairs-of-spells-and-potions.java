class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions);
        
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int start = 0;
            int end = m - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if ((long) spell * potions[mid] >= success)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            ans[i] = m - start;
        }
        
        return ans;
    }
}