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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> nodeList = new ArrayList<>();
        int len = 0;
        ListNode node = head;
        ListNode leftNode = head;
        ListNode rightNode = head;
        
        while (node != null) {
            len++;
            node = node.next;
        }
        
        for (int i = 1; i < k; i++) {
            leftNode = leftNode.next;
        }
        
        for (int i = 1; i < len - k + 1; i++) {
            rightNode = rightNode.next;
        }
        
        int temp = rightNode.val;
        rightNode.val = leftNode.val;
        leftNode.val = temp;
        
        return head;
    }
}