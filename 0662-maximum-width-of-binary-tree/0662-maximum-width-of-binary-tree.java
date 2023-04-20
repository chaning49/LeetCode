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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        
        int ans = 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> qIdx = new LinkedList<>();
        q.offer(root);
        qIdx.offer(0);
        
        while (!q.isEmpty()) {
            int start = 0;
            int end = 0;
            int size = q.size();
            
            for (int i = 0; i < size; ++i) {
                TreeNode node = q.poll();
                int idx = qIdx.poll();
                if (i == 0)
                    start = idx;
                
                if (i == size - 1)
                    end = idx;
                
                if (node.left != null) {
                    q.offer(node.left);
                    qIdx.offer(2 * idx + 1);
                }
                
                if  (node.right != null) {
                    q.offer(node.right);
                    qIdx.offer(2 * idx + 2);
                }
            }
            
            ans = Math.max(ans, end - start + 1);
        }
        
        return ans;
    }
}