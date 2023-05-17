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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        int ans = 0;
        
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        
        for (int i = 0; i < list.size() / 2; i++) {
            int sum = list.get(i) + list.get(list.size() - i - 1);
            ans = Math.max(ans, sum);
        }
        
        return ans;
    }
}