class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        
        int start = 0;
        int end = people.length - 1;
        while (start <= end) {
            int remain = limit - people[end--];
            if (remain >= people[start])
                start++;
            ans++;
        }
        
        return ans;
    }
}