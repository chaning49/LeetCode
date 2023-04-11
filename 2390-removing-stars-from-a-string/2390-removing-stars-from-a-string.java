class Solution {
    public String removeStars(String s) {
        List<String> list = new ArrayList<>();
        for (String str : s.split("")) {
            if (str.equals("*") && !list.isEmpty())
                list.remove(list.size() - 1);
            else
                list.add(str);
        }
        
        String ans = "";
        for (String str : list)
            ans += str;
        return ans;
    }
}