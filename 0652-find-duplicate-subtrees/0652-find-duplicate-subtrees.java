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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        Map<String, Integer> check = new HashMap<>();
        dfs(root, check, ans);
        return ans;
    }
    
    private String dfs(TreeNode root, Map<String, Integer> check, List<TreeNode> list) {
        if (root == null) return "null";
        
        String key = Integer.toString(root.val) + "," + dfs(root.left, check, list) + "," + dfs(root.right, check, list);
        Integer value = check.get(key);
        
        if (value == null) value = 1;
        else {
            if (value == 1) list.add(root);
            value += 1;
        }
        
        check.put(key, value);
        return key;
    }
}