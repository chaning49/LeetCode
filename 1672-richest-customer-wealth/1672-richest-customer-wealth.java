class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] customer : accounts) {
            int sum = Arrays.stream(customer).sum();
            if (richest < sum)
                richest = sum;
        }
        return richest;
    }
}