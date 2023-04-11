class Solution {
    public String removeStars(String s) {
        Deque<String> dq = new ArrayDeque<>();
        for (String str : s.split("")) {
            if (str.equals("*") && !dq.isEmpty())
                dq.pollLast();
            else
                dq.addLast(str);
        }
        
        String ans = "";
        while (!dq.isEmpty())
            ans += dq.pollFirst();
        return ans;
    }
}