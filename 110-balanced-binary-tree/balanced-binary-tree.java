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
    boolean isBalance = true;
    public boolean isBalanced(TreeNode root) {
        bal(root);
        return isBalance;

    }
    public int bal(TreeNode node){
        if(node==null) return 0;
        int lh=bal(node.left);
        int rh=bal(node.right);
        int mans=Math.max(lh,rh)+1;
        if(Math.abs(rh-lh)>1){
            isBalance = false;
        }
        return mans;
    }
}