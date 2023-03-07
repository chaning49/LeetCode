class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long start = 1L;
        // long end = Arrays.stream(time).max().getAsInt() * (long) totalTrips;
        long end = (long) 1e14;
        
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
            tot += mid / (long) t;
        }
        return tot;
    }
}