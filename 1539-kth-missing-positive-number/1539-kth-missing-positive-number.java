import java.util.stream.IntStream;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>(k);
        
        int i = 0;
        int n = 1;
        while (k > i) {
            int finalN = n;
            if (IntStream.of(arr).noneMatch(x -> x == finalN)) 
                i++;
            n++;
        }
        
        return n - 1;
    }
}