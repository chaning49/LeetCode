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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildLeftRight(inorder, postorder);
    }
    
    private TreeNode buildLeftRight(int[] inorder, int[] postorder) {
        if (inorder.length == 0)
            return null;
        if (inorder.length == 1)
            return new TreeNode(inorder[0]);
        
        TreeNode root = new TreeNode(postorder[postorder.length - 1]); // root
        int rootIdx = findIdx(inorder, root.val);
        
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, rootIdx);
        int[] rightInorder = Arrays.copyOfRange(inorder, rootIdx + 1, inorder.length);
        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, rootIdx);
        int[] rightPostorder = Arrays.copyOfRange(postorder, rootIdx, postorder.length - 1);
        
        root.left = buildLeftRight(leftInorder, leftPostorder);
        root.right = buildLeftRight(rightInorder, rightPostorder);
        
        return root;
    }
    
    private int findIdx(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value)
                return i;
        return -1;
    }
}