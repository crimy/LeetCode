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

    public boolean isValidBST(TreeNode root) {       
        return isValid( root, null, null );
    }
    public boolean isValid(TreeNode now, Integer min, Integer max ) {
        if( now == null ) {
            return true;
        }
        if( (min != null && now.val <= min) || ( max != null  && now.val >= max ) ) {
            return false;
            
        }
        return( isValid( now.right, now.val, max ) && isValid( now.left, min, now.val ) );
    
    }
}