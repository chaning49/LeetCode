class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        List<Integer> stk = new ArrayList<>(pushed.length);
        int idx = 0;
    
        for (int p : pushed) {
            stk.add(p);
            
            while (!stk.isEmpty() && stk.get(stk.size() - 1) == popped[idx]) {
                stk.remove(stk.get(stk.size() - 1));
                ++idx;
            }
        }
        
        return stk.isEmpty() ? true : false;
    }
}