class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>(2);
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        
        // 배열에 포함된 중복 제거하면서 List 생성
        List<Integer> list1 = addList(nums1);
        List<Integer> list2 = addList(nums2);
        
        // 리스트에서 서로 존재하는 값을 제거
        for (Integer l1 : list1) {
            if (!list2.contains(l1))
                answer.get(0).add(l1);
        }
        
        for (Integer l2 : list2) {
            if (!list1.contains(l2))
                answer.get(1).add(l2);
        }
        
        return answer;
    }
    
    private List<Integer> addList(int[] arr) {
        List<Integer> list = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i]))
                list.add(arr[i]);
        }
        return list;
    }
}