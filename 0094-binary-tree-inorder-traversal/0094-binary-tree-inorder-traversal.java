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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recur(root,result);
        return result;
    }

    public void recur(TreeNode root,List<Integer> result){
              if(root == null) return;
              if(root.left != null) recur(root.left,result);
              result.add(root.val);
              if(root.right!=null)recur(root.right,result); 

    }
}