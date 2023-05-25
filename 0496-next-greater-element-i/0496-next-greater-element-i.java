class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int idx = findIndex(nums2, nums1[i]);
            ans[i] = -1;
            for (int j = idx; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
    
    private int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}