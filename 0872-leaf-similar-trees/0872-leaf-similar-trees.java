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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean result = true;
        List<Integer> root1Leaf = new ArrayList<>();
        List<Integer> root2Leaf = new ArrayList<>();
        root1Leaf = nodeLeafList(root1,root1Leaf);
        root2Leaf = nodeLeafList(root2,root2Leaf);
        if(root1Leaf.size() != root2Leaf.size()) return false;
        for(int i = 0 ; i < root1Leaf.size(); i++){
            if(root1Leaf.get(i).equals(root2Leaf.get(i))){
                continue;
            }else{
                return false;
            }
        }
        return result;
    }

    public List<Integer> nodeLeafList(TreeNode root ,List<Integer> rootLeaf){
        if(root.left == null && root.right == null){
            rootLeaf.add(root.val);
            return rootLeaf;
        }
        if(root.left != null)nodeLeafList(root.left,rootLeaf);
        if(root.right != null) nodeLeafList(root.right,rootLeaf);
        return rootLeaf;
    }
}