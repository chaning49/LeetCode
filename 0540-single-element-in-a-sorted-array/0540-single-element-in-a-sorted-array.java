class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid % 2 == 1) mid--; // mid 값이 홀수라면 왼쪽 값으로 맞춰준다.
            if (nums[mid] == nums[mid + 1]) start = mid + 2; // mid 값의 오른쪽이 같으면 한 쌍이 존재하는 값이므로 
            else end = mid;
        }
        
        return nums[start];
    }
}

//         int ans = 0;
//         if (nums.length == 1) return nums[0];
        
//         for (int i = 0; i < nums.length / 2; i++) {
//             if (nums[2 * i] != nums[2 * i + 1]) {
//                 ans = nums[2 * i];
//                 return ans;
//             }
//         }
//         if (nums.length % 2 == 1) ans = nums[nums.length - 1];
//         return ans;