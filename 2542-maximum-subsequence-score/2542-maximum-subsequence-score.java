class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] {nums2[i], nums1[i]};
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a, b) -> a - b);
        long ans = 0;
        long totalSum = 0;
        for (int[] pair : pairs) {
            minHeap.offer(pair[1]);
            totalSum += pair[1];
            if (minHeap.size() > k)
                totalSum -= minHeap.poll();
            if (minHeap.size() == k)
                ans = Math.max(ans, totalSum * pair[0]);
        }
        return ans;
    }
}