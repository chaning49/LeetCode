class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        int idx = 0;
        
        while (idx < chars.length) {
            int cnt = 0;
            char word = chars[idx];
            
            while (idx < chars.length && word == chars[idx]) {
                cnt++;
                idx++;
            }
            
            chars[ans++] = word;
            if (cnt > 1) {
                for (char c : String.valueOf(cnt).toCharArray())
                    chars[ans++] = c;
            }
        }
        
        return ans;
    }
}