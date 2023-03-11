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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        for (ListNode node = head; node != null; node = node.next) {
            list.add(node.val);
        }
        
        return makeBST(list, 0, list.size() - 1);
    }
    
    private TreeNode makeBST(List<Integer> list, int l, int r) {
        if (l > r) {
            return null;
        }
        
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = makeBST(list, l, mid - 1);
        root.right = makeBST(list, mid + 1, r);
        
        return root;
    }
}