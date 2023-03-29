class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int ans = 0;
        Arrays.sort(satisfaction);
        
        List<Integer> satList = new ArrayList<>(satisfaction.length);
        for (int s : satisfaction)
            satList.add(s);
        
        List<Integer> index = new ArrayList<>(satisfaction.length);
        for (int i = 1; i <= satisfaction.length; i++)
            index.add(i);
        
        while (satList.size() > 0) {
            int temp = 0;
            for (int i = 0; i < satList.size(); i++)
                temp += satList.get(i) * index.get(i);
            ans = Math.max(ans, temp);
            
            temp = 0;
            satList.remove(0);
            index.remove(index.size() - 1);
        }
        
        return ans;
    }
}