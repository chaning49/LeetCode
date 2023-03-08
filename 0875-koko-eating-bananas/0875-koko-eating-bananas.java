class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        
        while (start < end) {
            int mid = (start + end) / 2;
            int value = dividePiles(piles, mid);
            
            if (value <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
    
    private static int dividePiles(int[] piles, int k) {
        int sum = 0;
        for (int p : piles) {
            sum += p / k;
            if (p % k != 0) {
                sum++;
            }
        }
        return sum;
    }
}