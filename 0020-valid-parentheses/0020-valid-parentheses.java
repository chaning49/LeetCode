class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        Stack<String> stk = new Stack<>();
        
        for (String str : s.split("")) {
            if (str.equals("(") || str.equals("{") || str.equals("["))
                stk.push(str);
            else {
                if (stk.isEmpty())
                    return false;
                else {
                    if (stk.peek().equals("(") && !str.equals(")")) return false;
                    if (stk.peek().equals("{") && !str.equals("}")) return false;
                    if (stk.peek().equals("[") && !str.equals("]")) return false;
                    stk.pop();
                }
            }
        }
        
        return stk.isEmpty() ? true : false;
    }
}