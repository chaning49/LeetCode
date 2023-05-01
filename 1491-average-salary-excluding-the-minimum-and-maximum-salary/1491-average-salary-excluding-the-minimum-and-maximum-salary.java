class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        
        double sum = 0.0;
        for (int sal : salary) {
            sum += sal;
        }
        
        return (sum - (salary[0] + salary[salary.length - 1])) / (double) (salary.length - 2);
    }
}