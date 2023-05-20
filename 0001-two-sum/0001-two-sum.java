class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> findIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // target을 찾은 경우
            if (findIndex.containsKey(target - nums[i])) {
                return new int[] {findIndex.get(target - nums[i]), i};
            }
            
            // 아닌 경우 - 값에 인덱스를 매핑
            findIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}