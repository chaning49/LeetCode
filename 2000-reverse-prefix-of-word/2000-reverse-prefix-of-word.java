class Solution {
    public String reversePrefix(String word, char ch) {
        if (!word.contains(String.valueOf(ch)))
            return word;
        
        int idx = word.indexOf(ch);
        StringBuilder sb = new StringBuilder(word.substring(0, idx + 1)).reverse();
        sb.append(word.substring(idx + 1));
        
        return sb.toString();
    }
}