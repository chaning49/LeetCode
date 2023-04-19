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
    public int ans = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root, 0, true);
        dfs(root, 0, false);
        return ans;
    }
    
    private void dfs(TreeNode node, int depth, boolean isLeft) {
        if (node == null)
            return;
        ans = Math.max(ans, depth);
        if (isLeft) {
            dfs(node.right, depth + 1, false);
            dfs(node.left, 1, true);
        } else {
            dfs(node.left, depth + 1, true);
            dfs(node.right, 1, false);
        }
    }
}