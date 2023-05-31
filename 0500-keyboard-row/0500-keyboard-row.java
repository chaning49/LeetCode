class Solution {
    public String[] findWords(String[] words) {
        int[] alphabet = new int[26];
        String[] rows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                alphabet[c - 'A'] = i;
            }
        }
        
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            int row = alphabet[word.toUpperCase().charAt(0) - 'A'];
            boolean isSame = true;
            for (char c : word.toUpperCase().toCharArray()) {
                if (alphabet[c - 'A'] != row) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }
}