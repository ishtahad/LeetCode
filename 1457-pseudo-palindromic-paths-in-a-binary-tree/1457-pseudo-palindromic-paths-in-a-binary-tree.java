class Solution {
    // BIT MANPULATION
    private int result=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        recur(root,0);
        return result;
    }
    private void recur(TreeNode root,int count) {
        if(root == null) return;
        count ^= (1 << root.val);
        if(root.left==null && root.right==null) {
            if((count & (count-1)) == 0){
                result ++; 
            }
               
        }
        recur(root.left,count);
        recur(root.right,count);
        
    }
    
}