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
    public List<Integer> res;

    public List<Integer> inorderTraversal(TreeNode root) {
       res = new ArrayList<>();
       inorderRec(root);
       return res;
        
    }

    public void  inorderRec(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderRec(root.left);
        res.add(root.val);
        inorderRec(root.right);
    }
}