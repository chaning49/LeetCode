class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            if (num % 2 == 1) num *= 2;
            treeSet.add(num);
        }
        
        int ans = treeSet.last() - treeSet.first();
        
        while (treeSet.last() % 2 == 0) {
            treeSet.add(treeSet.pollLast() / 2);
            ans = Math.min(ans, treeSet.last() - treeSet.first());
        }
        
        return ans;
    }
}