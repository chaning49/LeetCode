class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> hp = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones)
            hp.add(stone);
        
        while (hp.size() > 1) {
            int y = hp.poll();
            int x = hp.poll();
            if (x != y)
                hp.add(y - x);
        }
        return hp.size() > 0 ? hp.poll() : 0;
    }
}