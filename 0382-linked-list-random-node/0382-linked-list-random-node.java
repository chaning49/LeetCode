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
        int ans = 0;
        int i = 1;
        while (findNode != null) {
            if (rand.nextInt(i) == i - 1)
                ans = findNode.val;
            findNode = findNode.next;
            i++;
        }
        
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */