class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] pp = path.split("/");
        
        for (String p : pp) {
            if (!stack.isEmpty() && p.equals(".."))
                stack.pop();
            else if (!p.equals("") && !p.equals(".") && !p.equals(".."))
                stack.push(p);
        }
        
        if (stack.isEmpty()) 
            return "/";
        
        while (!stack.isEmpty())
            sb.insert(0, stack.pop()).insert(0, "/");
        
        return sb.toString();
    }
}