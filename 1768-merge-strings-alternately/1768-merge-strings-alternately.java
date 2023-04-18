class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len = word1.length() <= word2.length() ? word1.length() : word2.length();
        
        for (int i = 0; i < len; i++)
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        
        if (word1.length() > word2.length())
            sb.append(word1.substring(len));
        else
            sb.append(word2.substring(len));
        
        return sb.toString();
    }
}