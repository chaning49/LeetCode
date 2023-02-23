import java.util.PriorityQueue;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        
        for (int i = 0; i < capital.length; i++)
            minHeap.add(new int[] {capital[i], profits[i]});
        
        for (int i = 0; i < k; i++) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= w)
                maxHeap.add(minHeap.remove());
            
            if (maxHeap.isEmpty())
                break;
            
            w += maxHeap.remove()[1];
        }
        return w;
    }
}