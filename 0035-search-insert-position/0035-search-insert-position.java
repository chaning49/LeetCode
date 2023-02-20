class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0; 
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) { 
            mid = (start + end) / 2;
            if (target == nums[mid]) { 
                return mid;
            } else if (nums[mid] < target) { 
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }
        return start;
    }
}