class Solution {
    public int partitionString(String s) {
        int ans = 1;
        List<String> exists = new ArrayList<>(s.length());
        
        for (String str : s.split("")) {
            if (!exists.contains(str))
                exists.add(str);
            else {
                exists.clear();
                exists.add(str);
                ans++;
            }
        }
        
        return ans;
    }
}