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
    public boolean isSameTree(TreeNode p, TreeNode q) {
         //if(p == null && q != null || p != null && q == null )return false;
         //if(p == null || q == null) return false;
         //if(p.val != q.val) return false;
         //recur(p,q);
         boolean result = true;
         return recur(p,q,result);
    }

    public boolean recur(TreeNode p, TreeNode q,boolean result){
        if(p == null && q == null){
                result = true;
                return result;
        }
        
        if(((p == null && q != null) || (p != null && q == null ))|| p.val != q.val){
            result = false;
            //System.out.println(result);
            return result;
        }
        //System.out.println(p.val + " : " + q.val + " : "+ result);
        if (result == false )return false;
        
        
        //System.out.println(p.val + " : " + q.val + " : "+ result);
        //recur(p.left,q.left,result);
        //recur(p.right,q.right,result);

        return recur(p.left,q.left,result) && recur(p.right,q.right,result);
    }
}