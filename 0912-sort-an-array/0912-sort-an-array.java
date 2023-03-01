import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        return heapSort(nums);
    }
    
    private int[] heapSort(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<> ();
        int[] ans = new int[nums.length];
        for (int num : nums) {
            pq.add(num);
        }
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = pq.poll().intValue();
        }
        
        return ans;
    }
}