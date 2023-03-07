class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long ans = 0L;
        
        long start = 1L;
        long end = Arrays.stream(time).max().getAsInt() * (long) totalTrips;
        
        while (start < end) {
            long mid = (start + end) / 2;
            long value = makeTotal(time, mid);
            
            if (value >= totalTrips) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
    
    private long makeTotal(int[] time, long mid) {
        long tot = 0L;
        for (int t : time) {
            tot += mid / t;
        }
        return tot;
    }
}