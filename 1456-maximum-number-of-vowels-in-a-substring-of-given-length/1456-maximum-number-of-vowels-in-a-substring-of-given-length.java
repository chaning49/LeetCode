class Solution {
    public int maxVowels(String s, int k) {
        int maxNum = 0;
        int currNum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            currNum += isVowel(s.charAt(i));
            if (i >= k)
                currNum -= isVowel(s.charAt(i - k));
            maxNum = Math.max(maxNum, currNum);
            if (maxNum == k)
                return maxNum;
        }
            
        return maxNum;
    }
    
    private int isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u')
            return 1;
        else
            return 0;
    }
}