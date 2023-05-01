class Solution {
    public double average(int[] salary) {
        double ans = 0.0;
        
        int maxNum = Arrays.stream(salary).max().getAsInt();
        int minNum = Arrays.stream(salary).min().getAsInt();
        
        for (int sal : salary) {
            if (maxNum == sal || minNum == sal)
                continue;
            ans += (double) sal;
        }
        
        ans /= (double) (salary.length - 2);
        
        return ans;
    }
}