class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        List<Integer> stk = new ArrayList<>(pushed.length);
        int idx = 0;
    
        for (int i = 0; i < pushed.length; i++) {
            stk.add(pushed[i]);
            
            while (!stk.isEmpty() && stk.get(stk.size() - 1) == popped[idx]) {
                stk.remove(stk.get(stk.size() - 1));
                ++idx;
            }
        }
        
        return stk.isEmpty() ? true : false;
    }
}