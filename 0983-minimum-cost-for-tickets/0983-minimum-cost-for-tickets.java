class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int last = days[days.length - 1];
        boolean[] tripDay = new boolean[last + 1];
        for (int day : days)
            tripDay[day] = true;
        
        int[] minCosts = new int[last + 1];
        
        for (int i = 1; i < last + 1; i++) {
            if (!tripDay[i]) {
                minCosts[i] = minCosts[i - 1];
                continue;
            }
            
            int one = minCosts[i - 1] + costs[0];
            int seven = minCosts[Math.max(0, i - 7)] + costs[1];
            int thirty = minCosts[Math.max(0, i - 30)] + costs[2];
            minCosts[i] = Math.min(one, Math.min(seven, thirty));
        }
        
        return minCosts[last];
    }
}