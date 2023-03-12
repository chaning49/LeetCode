/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> mergeList = new ArrayList<>();
        
        for (ListNode list : lists) {
            while (list != null) {
                mergeList.add(list);
                list = list.next;
            }
        }
        
        if (mergeList.size() == 0)
            return null;
        
        Collections.sort(mergeList, (a, b) -> a.val - b.val);
        
        for (int i = 1; i < mergeList.size(); i++) {
            mergeList.get(i - 1).next = mergeList.get(i);
        }
        
        return mergeList.get(0);
    }
}