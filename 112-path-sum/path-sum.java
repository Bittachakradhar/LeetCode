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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }
    public boolean dfs(TreeNode node,int sum){
        if(node == null) return false;
        sum=sum-node.val;
        if(node.left==null && node.right==null){
            return sum==0;
        }
        return dfs(node.left,sum) || dfs(node.right,sum);
    }
}