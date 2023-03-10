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
    private ListNode head;
    private Random rand = new Random();
    
    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
        ListNode findNode = head;
        int len = 0;
        while (findNode != null && findNode != null) {
            len++;
            findNode = findNode.next;
        }
        
        ListNode[] arr = new ListNode[len];
        findNode = head;
        
        for (int i = 0; i < len; i++) {
            arr[i] = findNode;
            findNode = findNode.next;
        }
        
        int idx = rand.nextInt(len);
        
        return arr[idx].val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */