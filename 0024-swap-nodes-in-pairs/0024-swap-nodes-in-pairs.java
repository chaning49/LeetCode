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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while (head != null && head.next != null) {
            ListNode odd = head;
            ListNode even = head.next;
            
            prev.next = even;
            odd.next = even.next;
            even.next = odd;
            
            prev = odd;
            head = odd.next;
        }
        
        return dummy.next;
    }
}