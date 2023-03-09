/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode node = head;
        
        do {
            if (node == null || node.next == null) 
                return null;
            nodes.add(node);
            node = node.next;
        } while (!nodes.contains(node));
        
        return nodes.get(nodes.indexOf(node));
    }
}