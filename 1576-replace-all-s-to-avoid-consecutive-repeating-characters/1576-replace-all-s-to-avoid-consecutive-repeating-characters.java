class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                char prev = (i != 0) ? arr[i - 1] : ' ';
                char next = (i != arr.length - 1) ? arr[i + 1] : ' ';
                char alpha = 'a';
                
                while (alpha == prev || alpha == next) {
                    alpha++;
                }
                
                arr[i] = alpha;
            }
        }
        return new String(arr);
    }
}