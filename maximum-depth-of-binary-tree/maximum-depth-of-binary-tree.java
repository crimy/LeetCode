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
    public int maxDepth(TreeNode root) {
         
        return DepthExplore( root, 0);
    }
    public int DepthExplore(TreeNode now, int d) {
        if( now == null ) return d;
        return Math.max(DepthExplore(now.left, d + 1), DepthExplore(now.right, d + 1));
    }
}