class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt();
        int end = Arrays.stream(weights).sum();
        
        while (start < end) {
            int mid = (start + end) / 2;
            int cnt = 1;
            int sum = 0;
            
            for (int weight : weights) {
                if (weight + sum <= mid) sum += weight;
                else {
                    cnt++;
                    sum = weight;
                }
            }
            
            if (cnt <= days) end = mid;
            else start = mid + 1;
        }
        
        return start;
    }
}