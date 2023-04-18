class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>(candies.length);
        int maxNum = Arrays.stream(candies).max().getAsInt();
        for (int c : candies) {
            answer.add(c + extraCandies >= maxNum ? true : false);
        }
        return answer;
    }
}
