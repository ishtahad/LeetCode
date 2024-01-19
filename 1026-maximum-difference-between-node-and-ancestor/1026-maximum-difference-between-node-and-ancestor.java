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
    int maxDiff = -1;
    public int maxAncestorDiff(TreeNode root) {
        maxDfference(root);
        return maxDiff;
    }

    public  void   maxDfferenceFromARoot(TreeNode root, TreeNode child) {
        if(root==null || child == null)return;

        maxDiff = Math.max(maxDiff,Math.abs(root.val - child.val));
        maxDfferenceFromARoot(root,child.left);
        maxDfferenceFromARoot(root,child.right);
    }

    public  void   maxDfference(TreeNode root) {
        if(root==null)return;
        maxDfferenceFromARoot(root,root.left);
        maxDfferenceFromARoot(root,root.right);
        maxDfference(root.left);
        maxDfference(root.right);
    }
}